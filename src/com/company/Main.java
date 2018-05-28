package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int previousResult=result;
        result=result-1;
        System.out.println( previousResult + "-1=" + result);
        result++;
        System.out.println("result is now=" + result);
        result++;
        System.out.println("result is now=" + result);
        result++;
        System.out.println("result is now=" + result);
        result++;
        System.out.println("result is now=" + result);

        int newValue=50;
        if(newValue==50)
            System.out.println("This is true");

        boolean isCar=false;
        if(isCar=true)
            System.out.println("This is not supposed to happend");
        isCar=true;
        boolean wasCar=isCar? true:false;
        if(wasCar)
            System.out.println("wascar is true");


        double firstVariable=20d;
        double secondVariable=80d;
        double total=(firstVariable + secondVariable)*25;
        System.out.println("total is:" +total);
        double remainder= total%40;
        System.out.println("remainder is:" +remainder);
        if(remainder<=20)
            System.out.println("Total was over the limit");





    }
}
