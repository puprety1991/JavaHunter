package com.syntax.replit.Interview;

public class Repls215 {
   /* A bracket is considered to be of the following characters: (, ).
    Two brackets are considered to be a matched pair if an opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.
    A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.
    By this logic, we say a sequence of brackets is balanced if the following conditions are met:
    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
    Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.
            **Function Description**
    Complete the function isBalanced in the editor below.
    isBalanced has the following parameter(s):
    Returns
    string s: a string of brackets
    string: either true or false
            **Examples**
    input "(()"  ->  false
    input "("  ->  false
    input ")"  ->  false
    input "(()))"  ->  false
    input "(())"  ->  true
    input "()"  ->  true
    input ")()("  ->  true*/

    public static void main(String[] args) {
        Repls215 entry = new Repls215();
        boolean balanced = entry.isBalanced("()()()))");
        System.out.println(balanced);
    }
    public static boolean isBalanced(String s){
        char[] arr=s.toCharArray();
        int openingBracket = 0;
        int closingBracket = 0;
        for (char sign : arr) {
            if (sign == '(') {
                openingBracket++;
            } else if(sign==')'){
                closingBracket++;
            }}
        if (openingBracket==closingBracket){
            return true;
        }
        else {
            return false;
        }}
    }




