package com.company;
//Gets the Greatest Common Divisor
public class Main{
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(30,12));

    }
    public static int getGreatestCommonDivisor(int f, int s){
        int m;
        int n;
        int temp;
        if((f<10)||(s<10)){
            return -1;
        }
        if (f>s){
            m = f;
            n = s;
        }else{
            m=s;
            n=f;

        }
        while (n!=0){
            temp = m%n;
            m=n;
            n=temp;
        }return m;
    }

}
