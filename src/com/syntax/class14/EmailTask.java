package com.syntax.class14;

public class EmailTask {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:
    createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        EmailTask email = new EmailTask();
        System.out.println(email.createEmail("joe","biden","hotmail"));
    }

}
