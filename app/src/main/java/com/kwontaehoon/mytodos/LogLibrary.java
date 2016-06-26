package com.kwontaehoon.mytodos;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kwontaehoon on 2016. 5. 29..
 */
public class LogLibrary {

    static String tag = "debugging";

    public static void print(){
        Log.d(tag, ".");
    }

    public static void print(String msg){
        Log.d(tag, msg);
    }

    public static void print(int num){
        Log.d(tag, "" + num);
    }

    public static void error(String msg){
        Log.e(tag, "*********ERROR********");
        Log.e(tag, msg);
        Log.e(tag, "**********************");
    }

    public static void error(){
        Log.e(tag, "**********************");
        Log.e(tag, "*********ERROR********");
        Log.e(tag, "**********************");
    }

    //??? ??? ??? ? ??
    public static void printEach(int [] arr){
        Log.w(tag, "---printing an integer array---");
        for(int i=0; i<arr.length; i =i+1){
            Log.d(tag, "index " + i + ": " + arr[i]);
        }
        Log.w(tag, "-------finished printing-------");
    }

    public static void printEach(String [] arr){
        Log.w(tag, "---printing an String array---");
        for(int i=0; i<arr.length; i =i+1){
            Log.d(tag, "index " + i + ": " + arr[i]);
        }
        Log.w(tag, "-------finished printing-------");
    }

    public static void printEach(double [] arr){
        Log.w(tag, "---printing an double array---");
        for(int i=0; i<arr.length; i =i+1){
            Log.d(tag, "index " + i + ": " + arr[i]);
        }
        Log.w(tag, "-------finished printing-------");
    }

    public static void printEach(ArrayList arr){
        Log.w(tag, "---printing an String array---");
        for(int i=0; i<arr.size(); i =i+1){
            Log.d(tag, "index " + i + ": " + arr.get(i));
        }
        Log.w(tag, "-------finished printing-------");
    }

    public static void printWhole(int [] arr){
        Log.w(tag, "---printing an integer array---");
        Log.d(tag, "" + Arrays.toString(arr));
        Log.w(tag, "-------finished printing-------");
    }

    public static void printWhole(String [] arr){
        Log.w(tag, "---printing an integer array---");
        Log.d(tag, "" + Arrays.toString(arr));
        Log.w(tag, "-------finished printing-------");
    }

    public static void printWhole(double [] arr){
        Log.w(tag, "---printing an integer array---");
        Log.d(tag, "" + Arrays.toString(arr));
        Log.w(tag, "-------finished printing-------");
    }

    public static void printWhole(ArrayList arr){
        Log.w(tag, "---printing an integer array---");
        Log.d(tag, "" + arr);
        Log.w(tag, "-------finished printing-------");
    }

}