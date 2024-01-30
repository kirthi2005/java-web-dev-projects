package org.example;

import java.util.ArrayList;

public class SumEven {

    public static int sumEvenInt(ArrayList<Integer> list){
        int sum =0;
        for (Integer i: list){
            if(i%2==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
