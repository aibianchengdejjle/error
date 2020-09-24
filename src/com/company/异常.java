package com.company;

import java.io.FileWriter;
import java.io.IOException;

/*
*       try{
*         有可能出现错误
*       }catch(){
*        处理异常
*       }finally 组合try catch使用，用于释放资源等收尾工作，
*
*
* */
public class 异常 {
    public static void main(String[] args)  {
        FileWriter fw=null;

        try {
            fw=new FileWriter("a.txt");
            fw.write("hello1");
            System.out.println(2/0);
            System.out.println("java1");
        } catch (IOException e) {
            e.printStackTrace();
        }finally { //finally无论有无异常都会执行得语句
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
        }
        }


        //method1();
        //method();
    }

    private static void method1() {
        try {
            System.out.println(2/0);
        } catch (Exception e) {
            System.out.println("除数不能为0");

        } finally {
            System.out.println("清理垃圾");
        }
    }

    private static void method() {
        try{
            System.out.println(2/0);
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());//原因
            System.out.println(e.toString());//类型和原因

        }
    }
}
