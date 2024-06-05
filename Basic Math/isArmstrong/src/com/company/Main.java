package com.company;

public class Main {

    public static void main(String[] args) {

     System.out.println(isArmstrong(153));

    }



//    method for finding the isArmstrong
     public static boolean isArmstrong(int num){

//        storing the length of the number
        int length = (int)Math.log10(num)+1; //TC: O(logn)
        int armstrongNum =0 ,  copyNum = num;

        for(int i =0; i<length ; i++){
//  extracting the unit digit and powering it with The length
          armstrongNum += (int)Math.pow(copyNum%10 , length); //TC O(logn)

//          updating the num
            copyNum /=10;
        }

         return num==armstrongNum ;

     }

}
