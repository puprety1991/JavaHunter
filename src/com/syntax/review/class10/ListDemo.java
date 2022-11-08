package com.syntax.review.class10;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String>animals=new ArrayList<>();
        animals.add("Monkey");
        animals.add("Donkey");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Buffalo");
        System.out.println(animals);

        for(String animal:animals){
            System.out.println(animal+":"+animal.length());
        }
        System.out.println();
        var iterator=animals.iterator();
        while(iterator.hasNext()){
            String word=iterator.next();
            System.out.println(word+":"+word.length());
        }
        System.out.println();
        animals.removeIf(item->item.length()>=7);
        System.out.println(animals);
        System.out.println();
        // if elements is more than 4 letter we want to replace that with Camel
        //We should not use iterator because we are not performing any operation that can change the size
        //We should not use enhanced for loop here as we are not printing the data we are updating the data.
        for(int i=0;i<animals.size();i++){
            if(animals.get(i).length()>4){
                animals.set(i,"Camel");
            }

        }
        System.out.println(animals);
        System.out.println();
        System.out.println(animals.subList(0,3));
        ListIterator<String>stringListIterator=animals.listIterator();
        while (stringListIterator.hasNext()){
            System.out.print(stringListIterator.next()+" ");
        }

    }
}
