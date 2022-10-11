package com.syntax.replit;

public class Repls148 {
    /*
    **In ShoppingStore class:**
    Create variables as below.
    - item, price, quantity
    Create a constructor to initialize instance variables. Create a method with name itemTotalPrice.
    write a logic to calculate the total values of items in stock. and print the result.
    return the total value.
        **In Main Class.**
            Create two Object of ShoppingStore and pass the parameters to Constructor.then using each object
            call the method itemTotalPrice. Store the returned value of each object.
            Calculate sum of both object and print the result.
            Output:
                    Blanket Total Value 99.98
                    Mattress Total Value 439.18
                    You purchased 539.16 Today
     */
    public static void main(String[] args){

        ShoppingStore items = new ShoppingStore("Blanket",49.99,2);
        ShoppingStore items1 = new ShoppingStore("Mattress",219.59,2);

        System.out.println("You purchased "+ (items.itemTotalPrice()+items1.itemTotalPrice())+" Today");

    }

}
class ShoppingStore{
    String item;
    double price;
    double quantity;

    ShoppingStore(String item, double price, double quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){
        double total = price*quantity;
        System.out.println(item+" Total Value "+total);
        return total;
    }
}
