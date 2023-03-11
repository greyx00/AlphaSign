package com.example.progetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Translator extends AppCompatActivity implements CameraBridgeViewBase.CvCameraViewListener2 {

    JavaCameraView javaCameraView;
    private Mat mRGBA,mRGBAT;

    List<Mat> arrayImmagini = new ArrayList<Mat>();

    LinkedList<Mat> immaginiGallery = new LinkedList<Mat>();

    private TextView tvRes = null;


    private Button bttReset = null;
    private Button bttCattura = null;
    private Button bttCanc = null;
    private Button bttSalva = null;
    private Button bttTest = null;

    private final String TAG = "MainActivity";


    private static final int W = 640;
    private static final int H = 480;


    //giallo
    private final Scalar Glow = new Scalar(100, 40, 40);
    private final Scalar Ghigh = new Scalar(140, 255, 255);

    //verde
    private final Scalar Vlow = new Scalar(90, 80, 80);
    private final Scalar Vhigh = new Scalar(115, 255, 255);

    //blu
    private final Scalar Blow = new Scalar(10, 30, 80);
    private final Scalar Bhigh = new Scalar(40, 255, 255);


    private Scalar low;
    private Scalar high;



    private boolean TESTmask = false;


    BaseLoaderCallback baseLoaderCallback = new BaseLoaderCallback(Translator.this) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case BaseLoaderCallback.SUCCESS: {

                    javaCameraView.enableView();
                    break;

                }
                default:
                {
                    super.onManagerConnected(status);
                    break;
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);
        OpenCVLoader.initDebug();
        tvRes = findViewById(R.id.tvRes);
        tvRes.setText("");

        bttReset = findViewById(R.id.bttReset);
        bttCattura = findViewById(R.id.bttCattura);
        bttCanc = findViewById(R.id.bttCanc);
        bttSalva = findViewById(R.id.bttSalva);
        bttTest = findViewById(R.id.bttTest);

        Bundle extras = getIntent().getExtras();
        switch (extras.getInt("colore")){
            case 1://giallo
                low = Glow;
                high = Ghigh;
                break;
            case 2://verde
                low = Vlow;
                high = Vhigh;
                break;
            default://blu
                low = Blow;
                high = Bhigh;
                break;
        }




        bttReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvRes.setText("");
            }
        });

        bttCattura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TESTmask){
                    Toast.makeText(getApplicationContext(), "ANALISI OFF", Toast.LENGTH_SHORT).show();
                }else{
                    String res = ImgAnalyzer.ANALYZE(arrayImmagini, immaginiGallery, low , high);
                    tvRes.setText(tvRes.getText() + res);

//                    System.gc();
                    mRGBAT.release();
                }
            }
        });

        bttCanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvRes.getText().equals("")){
                    tvRes.setText(tvRes.getText().subSequence(0, tvRes.getText().length()-1));
                }
            }
        });

        bttSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("EditText", tvRes.getText().toString());
                clipboard.setPrimaryClip(clip);
                clip.getDescription();
                Toast.makeText(getApplicationContext(), "Testo copiato.", Toast.LENGTH_SHORT).show();
            }
        });

        bttTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TESTmask = !TESTmask;
                if(TESTmask){
                    Toast.makeText(getApplicationContext(), "ANALISI OFF", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "ANALISI ON", Toast.LENGTH_LONG).show();

                }
            }
        });


        //lettura immagini di confronto
        immaginiGallery = ImgLoader.LoadIMGs(getResources());


        //resize immagini
        Size size = new Size(W, H);
        for (Mat i : immaginiGallery){
            Imgproc.resize(i, i, size);
        }

        //conversione per Core.norm() in ImgAnalyzer.ANALYZE()
        for(Mat i : immaginiGallery){
            Imgproc.cvtColor(i, i, Imgproc.COLOR_BGR2RGB);
            i.convertTo(i, CvType.CV_8U);
        }


        javaCameraView = (JavaCameraView) findViewById(R.id.camera);
        javaCameraView.setCameraPermissionGranted();
        javaCameraView.setVisibility(SurfaceView.VISIBLE);

        javaCameraView.enableFpsMeter();
        javaCameraView.setMaxFrameSize(W, H);

        javaCameraView.setCvCameraViewListener(Translator.this);
    }

    @Override
    public void onCameraViewStarted(int width, int height) {
        mRGBA = new Mat(height,width, CvType.CV_8U);
    }


    @Override
    public void onCameraViewStopped() {
        mRGBA.release();
    }



    @Override
    public Mat onCameraFrame(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {
        mRGBA = inputFrame.rgba();
        mRGBAT = mRGBA.t();
        Core.flip(mRGBA.t(),mRGBAT,1);
        Imgproc.resize(mRGBAT,mRGBAT,mRGBA.size());


        //memorizzazione immagini da analizzare
        arrayImmagini.add(mRGBAT);

        if(arrayImmagini.size() == 1000){
            arrayImmagini.clear();
        }

        mRGBA.release();


////////////////////////CURRENT FRAME IN HSV/////////////////////////////
////////////////////////ANALISI IMMAGINI DISABILITATA////////////////////
        if(TESTmask){
            Mat hsvImage = mRGBAT;

            Imgproc.cvtColor(hsvImage, hsvImage, Imgproc.COLOR_BGR2HSV_FULL);

            Core.inRange(hsvImage,
                    low,
                    high,
                    hsvImage);
        }
////////////////////////////////////////////////////////////////////////




        return mRGBAT;


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(javaCameraView != null)
        {
            javaCameraView.disableView();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if(javaCameraView != null)
        {
            javaCameraView.disableView();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(OpenCVLoader.initDebug())
        {
            Log.d(TAG,"OPEN CV CONNESSO");
            baseLoaderCallback.onManagerConnected(BaseLoaderCallback.SUCCESS);

        }
        else
        {
            Log.d(TAG,"OPEN CV NON CONNESSO");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION,this,baseLoaderCallback);
        }
    }

}
