package com.edu.general;

public class ReverseNumber {
    public static void main(String[] args) {
        rev(4567);
        System.out.println();
        int num = 123;
        while(num>0){
            int rev = num% 10;
            System.out.print(rev);
            num = num / 10;


        }
    }

    // Reverse number with recursion
    public static void rev(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        } else{
            System.out.print(number%10); // 3
            rev(number/10); //123/10 -->12  ---> 12/10 --->1
        }
    }
}
