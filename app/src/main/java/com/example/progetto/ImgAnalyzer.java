package com.example.progetto;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.util.List;

public class ImgAnalyzer {
    public static String ANALYZE(List<Mat> arrayImmagini, List<Mat> immaginiGallery, Scalar low, Scalar high) {
        try {
            Mat immagineDaAnalizzare = arrayImmagini.get(0);

            //hsv per creazione mask
            Mat hsvImage = new Mat();
            Imgproc.cvtColor(immagineDaAnalizzare, hsvImage, Imgproc.COLOR_BGR2HSV_FULL);


            //solo mano, rimozione background
            Mat mask = new Mat();
            Core.inRange(hsvImage,
                    low,
                    high,
                    mask);


            //conversione per Core.norm()
            Imgproc.cvtColor(mask, mask, Imgproc.COLOR_BGR2RGB);
            mask.convertTo(mask, CvType.CV_8U);

            double min = Core.norm(mask, immaginiGallery.get(0), Core.NORM_L1);
            int k = 0;
            int x = 0;
            for (Mat i : immaginiGallery) {
                double N = Core.norm(mask, i, Core.NORM_L1);
                if (N < min) {
                    min = N;
                    k = x;
                }
                x++;
            }

            arrayImmagini.clear();

            return "" + 'A'+(int)Math.floor(k/3);


//////galleria
            //ImgLoader.SaveToGallery(mask, getContentResolver());
//////galleria


        } catch (Exception e) {
            return "";
        }


    }

}

