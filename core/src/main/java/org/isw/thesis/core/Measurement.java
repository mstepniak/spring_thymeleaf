package org.isw.thesis.core;

import java.util.Random;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
public class Measurement {

    public int[] performMeasurement(long size) {
        int[] intArray = new int[(int)size];
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i] = randomFill();
        }
        return intArray;
    }
    private static int randomFill(){

        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }
}
