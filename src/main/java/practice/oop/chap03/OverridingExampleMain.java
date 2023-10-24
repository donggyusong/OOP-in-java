package practice.oop.chap03;

/**
 * 오버라이딩(재정의)-Overrding
 * 부모 클래스에서 상속받은 메서드를 자식 클래스에서 다시 정의하는 것
 */
public class OverridingExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.someMethod();
        child.someMethod();
    }
}
