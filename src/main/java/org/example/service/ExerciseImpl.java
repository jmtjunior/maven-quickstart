package org.example.service;

public class ExerciseImpl implements Exercise{

    @Override
    public int[] countPositiveSumNegatives(int[] value) {
        int[] result = new int[2];
        int count = 0;
        int sum = 0;
        for (int i: value){
            if (i < 0){
                sum+=i;
            } else{
                if(i!=0){
                    count+=1;
                }
            }
        }
        result[0]=count;
        result[1]=sum;
        return result;
    }
}
