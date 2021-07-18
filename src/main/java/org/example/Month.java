package org.example;

public class Month {
    public void getMonth(int number){
        switch (number) {
            case 1:
                System.out.println("The name of month is January");
            case 2:
                System.out.println("The name of month is February");
            case 3:
                System.out.println("The name of month is March");
            case 4:
                System.out.println("The name of month is April");
            case 5:
                System.out.println("The name of month is May");
            case 6:
                System.out.println("The name of month is June");
            case 7:
                System.out.println("The name of month is July");
            case 8:
                System.out.println("The name of month is August");
            case 9:
                System.out.println("The name of month is September");
            case 10:
                System.out.println("The name of month is October");
            case 11:
                System.out.println("The name of month is November");
            case 12:
                System.out.println("The name of month is December");
            default:
                System.out.println("The number is not within 1-12");
        }
    }
}
