package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

//   declaring the list
            List<Integer> testCases = new ArrayList<Integer>();
            testCases.add(-12303000);
            testCases.add(12);
            testCases.add(3);
            testCases.add(4320500);

            for(int i =0 ; i< testCases.size();i++){
                int revNum = revNumber(testCases.get(i));
                System.out.println("num: "+testCases.get(i)+" revNum: "+revNum);
            }

        }

        // method for reversing the number
        public static int revNumber(int num){
            // returns if the number is unit digit
            if(num <=9 && num >=-9)return num;

            // flag variable to check if the number is negative
            boolean isNegative =false;

            // flagging the  value
            if(num <0) {
                isNegative =true;
                //  absoulte the value
                num = Math.abs(num);


            }

            // declaring the number for setting the rev value
            int rNum= 0;
            // reversing the valilue
            while(num>0){
                int digitVal = num%10;
                num/=10;
                //   System.out.println("digit Value: "+digitVal);
                if(digitVal==0&& rNum==0){

                    continue;

                }

                rNum =  rNum*10 +  digitVal;

            }


            return isNegative ? (rNum *-1) : rNum;
        }

}
