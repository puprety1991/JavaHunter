package com.syntax.Lambda;

@FunctionalInterface
public interface Greeting {
     void perform();

}
/*The functionalInterface annotation is completely optional. The Java compiler does not require
 it for your lambda type. But it is good practice to add it.*/