package com.example.progetto;


import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.util.Log;

import org.opencv.android.Utils;
import org.opencv.core.CvException;
import org.opencv.core.Mat;

import java.util.LinkedList;

public class ImgLoader {

    public static LinkedList<Mat> LoadIMGs(Resources res){
        LinkedList<Mat> immaginiGallery = new LinkedList<Mat>();

        Bitmap aux = BitmapFactory.decodeResource(res, R.drawable.aa1);
        Mat img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.aa2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.aa3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.bb1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.bb2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.bb3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.cc1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.cc2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.cc3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.dd1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.dd2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.dd3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ee1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ee2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ee3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ff1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ff2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ff3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.gg1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.gg2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.gg3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.hh1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.hh2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.hh3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ii1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ii2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ii3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.jj1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.jj2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.jj3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.kk1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.kk2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.kk3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ll1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ll2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ll3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.mm1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.mm2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.mm3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.nn1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.nn2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.nn3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.oo1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.oo2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.oo3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);



        aux = BitmapFactory.decodeResource(res, R.drawable.pp1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.pp2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.pp3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.qq1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.qq2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.qq3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.rr1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.rr2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.rr3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ss1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ss2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ss3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.tt1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.tt2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.tt3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.uu1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.uu2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.uu3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.vv1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.vv2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.vv3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.ww1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ww2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.ww3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.xx1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.xx2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.xx3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);


        aux = BitmapFactory.decodeResource(res, R.drawable.yy1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.yy2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.yy3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.zz1);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.zz2);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);

        aux = BitmapFactory.decodeResource(res, R.drawable.zz3);
        img = new Mat();
        Utils.bitmapToMat(aux, img);
        immaginiGallery.add(img);



        return immaginiGallery;
    }

    public static void SaveToGallery(Mat input, ContentResolver cr){
        Bitmap bmp = null;
        Mat tmp = input;

        try {
            bmp = Bitmap.createBitmap(tmp.cols(), tmp.rows(), Bitmap.Config.ARGB_8888);
            Utils.matToBitmap(tmp, bmp);
        }
        catch (CvException e){
            Log.d("Exception",e.getMessage());
        }

//            MediaStore.Images.Media.insertImage(getContentResolver(), bmp,String.valueOf(Core.countNonZero(res)), String.valueOf(Core.countNonZero(res)));
        MediaStore.Images.Media.insertImage(cr, bmp,"sdsd","asas");
    }
}
