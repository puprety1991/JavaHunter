package com.syntax.class19;

public class Task1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through
     constructor call. Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String number;

    public Task1(String name,String number){
        this.name=name;
        this.number=number;
    }
}
class UserInfo extends Task1{
    String address;

    public UserInfo(String name, String number,String address) {
        super(name, number);
        this.address=address;
    }

    void userDetails(){
        System.out.println("Name: "+name+", Phone: "+number+", Address: "+address);
    }
}
class userTester{
    public static void main(String[] args) {
        UserInfo user = new UserInfo("Nancy","706-78-6543","6640 lee St.");
        user.userDetails();
    }
}
