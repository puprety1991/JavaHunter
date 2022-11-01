package com.syntax.replit;

public class Repls181 {
    public static void main(String[] args){
        Accounts ac = new Accounts(4343443,"oscar","oscar@gmail.com",33000);
        ac.setAcNumber(7560504000l);
        ac.setName("Sumair");
        ac.setEmail("sumair@syntax.com");
        ac.setAmount(50000);

        System.out.println(ac.getAcNumber()+" "+ac.getName()+" "+ac.getEmail()+" "+ac.getAmount());
    }
}
class Accounts{
    private long acc_no;
    private String name;
    private String email;
    private double amount;
    Accounts(int acc_no,String name,String email,double amount){
        setAcNumber(acc_no);
        setName(name);
        setEmail(email);
        setAmount(amount);
    }
    public void setAcNumber(long acc_no){
        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public long getAcNumber(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getAmount(){
        return amount;
    }
}
