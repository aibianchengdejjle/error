package com.company;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {

        try {
            check(110);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
    /*public  static  boolean check(int a){
        if(a<0||a>100)
        {
            return false;
        }
        return true;
    }*/
    public  static  void  check(int a) throws Exception {
        if(a<0||a>100)
        {
            // throw  new RuntimeException("输入错误");//运行错误
              throw  new Exception("输入错误");//如果不改就是编译错误
        }
        System.out.println("符合要求");
    }
}
