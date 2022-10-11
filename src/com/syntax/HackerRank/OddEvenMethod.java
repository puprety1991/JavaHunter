package com.syntax.HackerRank;

public class OddEvenMethod {
    /*
     Task
    Given an integer,'n', perform the following conditional actions:
    If 'n' is odd, print Weird
    If 'n' is even and in the inclusive range of 2 to 5, print "Not Weird"
    If 'n' is even and in the inclusive range of 6 to 20 , print "Weird"
    If 'n' is even and greater than 20, print "Not Weird"
    NOTE: TRY TO SOLVE USING CONSTRUCTOR AND METHOD WHICH WE JUST LEARN. YOU CAN CREATE OBJECT IN SAME CLASS.
     */

    int num;
    OddEvenMethod(int num){
        this.num=num;
    }
    void OddEven(){
        if (num >= 6 && num <= 20) {
            System.out.println("Weird");
        }
        if (num % 2 == 0) {
            if((num>=2 && num<=5)||(num>20)){
                System.out.println("Not Weird");
            }
        } else if(!(num >= 6 && num <= 20)) {
            System.out.println("Weird");
        }
    }
    public static void main(String[] args) {
        OddEvenMethod number = new OddEvenMethod(12);
        number.OddEven();
    }
}
