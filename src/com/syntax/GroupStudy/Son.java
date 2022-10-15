package com.syntax.GroupStudy;
class GrandFather{
    String name="Anna";
    public void getMarry(){
        System.out.println("get married with "+name);
    }
}

 class Father extends GrandFather{
    String name="Sarah";
    public void getMarry(){
        System.out.println("get married with "+name);
    }
}
public class Son extends Father{
   public void getMarry(){
       System.out.println("I will get marry whom i love ");
    }
}

