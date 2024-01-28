package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        System.out.println("Enter a radius value to find the area of circle");
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter a radius");
        Double radius = input.nextDouble();
        //Double area = 3.14 * radius * radius;
        if(radius<0 && radius.equals("") && radius.isNaN()){
           System.out.println("Enter correct radius value");
                }
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        */

        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            if(radius>0){
                double area = 3.14 * radius * radius;
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
            else{
               System.out.println("Enter positive number for a radius");
            }
        }
        else{
            System.out.println("this is not a valid number");
        }

        double radius;
        do{
           System.out.println("Please enter a positive number for a radius");
           while(!input.hasNextDouble()){
               System.out.println("The radius must be a number. Try again!");
               input.next();
           }
           radius = input.nextDouble();
        }while(radius<=0);
        double area = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        input.close();
    }
}
