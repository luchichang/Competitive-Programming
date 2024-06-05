package com.company;

public class Main {

    public static void main(String[] args) {


       System.out.println(gcdOptimal(100,12));

    }

//    method for finding the gcd of two number BRUTE FORCE APPROACH
/*
*    Complexity Analysis
* TIME  COMPLEXITY : O(n) , where n is minimum number
* SPACE COMPLEXITY : O(1)
*/
    public static int gcdOfTwoNumber(int num1 , int num2){

        // setting the  result value
        int GCD = 0;
       int minNum =Math.min(num1,num2);
        for(int i =1; i<=minNum;i++){
            if(num1 %i ==0 && num2%i ==0){
                GCD = i;
            }
        }

        return GCD;
    }

//    method for finding the gcd Better Approach

/*
*  Complexity Analysis
* TIME  COMPLEXITY : O(n) where n is minimum of two number
* SPACE COMPLEXITY : O(1)
* **************note***********
* here time complexities are same as  Brute force but there will be less Iteration physically compared to prev
*/
    public static int GCDLessIteration(int num1 , int num2){

//        looping from the min to 1 inorder to avoid finding the less GCD
        for(int i = Math.min(num1, num2) ; i>=1;i--){

            if(num1 %i ==0 && num2 %i==0)return i;
        }
     return 1;

    }

//    optimal approach using Euclidean Algorithm
    public static int gcdOptimal(int a , int b){

        while(a>0 && b>0){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }

        if(a==0)return b;
        else return a;
    }

//    Optimizing the eucledians GCD
    public static int optimizedEucledian(int num1 , int num2){
        if(num1==0)return num2;
        if(num2==0)return num1;

        while(num1>0&&num2>0){

           if(num1 >num2){

           }
       }
        return 0;
    }


}
