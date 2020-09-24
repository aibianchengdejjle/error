package com.company;

public class digui {
    public static void main(String[] args) {
        System.out.println(show(5));
    }
    public  static int show(int n){
        if(n==1)
        {
            return 1;
        }

        return n*show(n-1);
    }
}
