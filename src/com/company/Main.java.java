package com.company;
/*
*          catch的顺序可以有子父类
*          平级之间没有顺序，子父级父级一定放在子类的后面
*
*
*
* */
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        //method2();
        //function();
        //method();
    }

    private static void method2() {
        try {
           /* String s=null;
            System.out.println(s.length());
            int []a=new int[5];
            System.out.println(a[6]);*/
            System.out.println(2/0);
        }catch (NullPointerException e)
        {
            System.out.println("字符串为空");
        }
        catch (ArrayIndexOutOfBoundsException x)
        {
            System.out.println("数组越界了");
        }
       catch (Exception E)
       {
           System.out.println("出现错误了");
       }
    }

    public static  void function() throws IOException {
        //编译异常
        FileWriter fw=new FileWriter("a.txt");
    }

    private static void method() {
        try {
System.out.println("2");
            System.out.println(2/0);
System.out.println("1");
}catch (ArithmeticException ae){
System.out.println("不能为0");
}
        //先执行try没有异常就往下运行，遇到异常就跳转到catch，catch结束后在运行下面的语句
    }
}
