package com.company;

import java.util.ArrayList;
import java.util.Collections;

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
//        reverseArrayLirary(list);

        System.out.println(RecursicereverseArray(list , 0 , list.size()-1));
    }


//    function for reversing the array BRUTE FORCE Method
    public static boolean BFreverseArray(ArrayList<Integer> arr){
//        creating the new array
        ArrayList<Integer> revarr = new ArrayList<Integer>();

        for(int i =arr.size()-1 ; i>=0;i--){
           revarr.add(arr.get(i));
        }
//        reversing the array using library
        Collections.reverse(arr);
        return arr == revarr;
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


//    reversing the array Optimal method recursive approach
    public static ArrayList<Integer> RecursicereverseArray(ArrayList<Integer> arr , int sIdx , int eIdx){

//        base condition
        if(sIdx >=eIdx)return arr;

//        swapping

        arr.set(sIdx , arr.get(sIdx)+arr.get(eIdx)); //a=a+b
        arr.set(eIdx,Math.abs(arr.get(sIdx)-arr.get(eIdx))); //b = a-b
        arr.set(sIdx, Math.abs(arr.get(sIdx)- arr.get(eIdx)));
        return RecursicereverseArray(arr , sIdx+1 ,eIdx-1);
    }

//    Library Approach
/*
* COMPLEXITY ANALYSIS
*  TIME  Complexity : O(n)
*  SPACE Complexity : O(1)
*/
    public static void reverseArrayLirary(ArrayList<Integer> arr){
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
