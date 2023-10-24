package practice.oop.chap03;

public class Parent {
    public int parentPublicInt;
    protected int parentProtectedInt;
    private int parentPrivateInt; //private 접근 제어자는 상속이 불가능하다.

    public void someMethod(){
        System.out.println("Parent someMethod");
    }
}
