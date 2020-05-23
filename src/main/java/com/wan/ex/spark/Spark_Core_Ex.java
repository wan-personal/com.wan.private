package com.wan.ex.spark;

import org.apache.spark.SparkConf;

public class Spark_Core_Ex {

    public static void main(String[] args) {

        SparkConf sparkConf = new SparkConf();

        for(StackTraceElement s : Thread.currentThread().getStackTrace())
            System.out.println(s.getClassName());

        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
