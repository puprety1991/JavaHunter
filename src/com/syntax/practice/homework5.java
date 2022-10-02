package com.syntax.practice;

public class homework5 {
        String emailId(String firstName, String lastName, String emailType) {
            return firstName + lastName + "@" + emailType + ".com";
        }

        public static void main(String[] args) {
            homework5 hw = new homework5();
            System.out.println(hw.emailId("john","Snow","gmail"));
        }
    }


