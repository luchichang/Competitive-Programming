package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	creating the list
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i =17;i>=5;i--)
        list.add(i);
//        reverseArray
//        NOTE: JAVA IS STRICTLY PASS BY VALUE
//       System.out.println(  reverseArray(list));

//
//      System.out.println(list.equals(BFreverseArray(list)));

    }


//    function for reversing the array BRUTE FORCE Method
    public static ArrayList<Integer> BFreverseArray(ArrayList<Integer> arr){
//        creating the new array
        ArrayList<Integer> revarr = new ArrayList<Integer>();

        for(int i =arr.size()-1 ; i>=0;i--){
           revarr.add(arr.get(i));
        }
        return  revarr;
    }


//    function for reversing the array ITERATIVE APPROACH
/*
*   COMPLEXITY ANALYSIS
* TIME  Complexity : O(n)
* SPACE Complexity : O(1)
*/
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr){

        int n = arr.size()-1;

        for(int i =0 ; i< arr.size()/2 ; i++){
//            swapping
//            int temp = arr.get(i);

//            a=a+b
            arr.set(i, arr.get(i)+ arr.get(n-i));
//            b=a-b
            arr.set(n-i , Math.abs(arr.get(i)-arr.get(n-i)));
//        a=a-b
            arr.set(i , Math.abs(arr.get(i)-arr.get(n-i)));
        }

      return arr;
    }
}
