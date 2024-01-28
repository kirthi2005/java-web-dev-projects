package org.launchcode;
import java.util.Scanner;
public class MilesGasUsage {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles you have driven");
        Double miles = input.nextDouble();
        System.out.println("Amount of gas used");
        Double gas = input.nextDouble();
        Double milesPerGallon = gas/miles;
        System.out.println("Miles per Gallon : " + milesPerGallon);
    }
}
