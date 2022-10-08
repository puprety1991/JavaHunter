package com.syntax.class18;

public class MouseTester {
    public static void main(String[] args) {
        System.out.println("-- Mouse1 --");
        Mouse1 mouse = new Mouse1();
        mouse.leftClick();
        mouse.rightClick();
        mouse.ScrollDown();
        mouse.ScrollUp();
        mouse.drag();

        System.out.println();
        System.out.println("-- Mouse2 --");
        Mouse2 mouse1 = new Mouse2();
        mouse1.ScrollDown();
        mouse1.ScrollUp();
        mouse1.rightClick();
        mouse1.leftClick();
        mouse1.broken();

        System.out.println();
        System.out.println("-- Mouse3 --");
        Mouse3 mouse2 = new Mouse3();
        mouse2.ScrollDown();
        mouse2.ScrollUp();
        mouse2.rightClick();
        mouse2.leftClick();
        mouse2.mouseInfo();
    }
}
