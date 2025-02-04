package com.sau.dti.method;

public class MyClassMet02 {
    //ประเภทของ method
    //1.no parameter no return
    public static void  showWow() {
        System.out.println("Wow wow wow");
    }

    //2.have parameter no return
    public static void sumNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    //3.no parameter have return
    public static String showSawasdee() {
        return "Sawasdee jaaaaa..." ;
    }

    //4.have parameter have return
    public static double calPowNumber(int a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        showWow();
        showWow();

        sumNumber(10, 20); //ค่าที่ส่งให้ parameter เรียก argument
        sumNumber(100, 200);

        //-----------------
        System.out.println( showSawasdee());
        String data = showSawasdee();
        System.out.println(data + "NinniN");

        System.out.println( calPowNumber(10, 2));
        double result = calPowNumber(5, 3);
        System.out.println("5^3 = " + result);
    }
}
