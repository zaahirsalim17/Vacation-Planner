package zaahir;

import java.util.Scanner;

public class VacationPlanner {

    public static void main(String[] args) {
        Planning();
        Tb();
        Td();
        Ca();
    }
    public static void Planning() {
        Scanner input= new Scanner(System.in) ;
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name= input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String nam=input.nextLine();
        System.out.println("Great! " + nam + " sounds like a great trip");
        System.out.println("***********\n");


    }
    public static void Tb() {
        Scanner input= new Scanner(System.in) ;
        System.out.print("How many days are you going to spend travelling? ");
        int m=input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int am=input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String n=input.next();
        n=n.toUpperCase();
        System.out.print("How many " +n + " are there in 1 USD? ");
        double b=input.nextDouble();

        int hr=m*24;
        int min=hr*60;
        int sc=min*60;
        System.out.println("If you are travelling for " + m + " days that is the same as " + hr + " hours or " + min + " minutes or " + sc + " seconds");
        double z= am*b;
        double x=(double)z/m;
        double ds=(double)am/m;
        System.out.println("If you are going to spend $" + am + " USD that means per day you can spend upto $" +String.format("%.2f", ds) + " USD");
        System.out.println("Your total budget in MXC is " + z + "MXC, which per day is " +String.format("%.2f" ,x) + " MXC");
        System.out.println("***********\n");

    }
    public static void Td() {
        Scanner input= new Scanner(System.in) ;
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int j=input.nextInt();
        System.out.println("That means when it is midnight at home it will be " + j + ":00 in your travel destination and when it is noon it will be " + (j+12) + ":00");
        System.out.println("***********\n");

    }
    public static void Ca() {
        Scanner input= new Scanner(System.in) ;
        System.out.print("What is the square area of your destination country in km2 ? ");
        double sa=input.nextDouble();
        double w=(double)sa/2.59;
        System.out.println("In miles2 that is " +String.format("%.1f", w) );
        System.out.println("***********\n");
}
    }
