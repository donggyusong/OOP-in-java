package practice.oop.chap03;

/**
 * -상속과 다형성
 *
 * 어떤 경우에 상속을 하면 좋은가?
 * 상속을 하게되면 부모 클래스의 메소드를 물려받아 사용할 수 있게 되기 때문에 메서드 재사용을 위해 상속을 하게되는 경우가 있다.
 * 그러나 메서드 재사용을 위해 상속을 이용하면 객체지향적으로 좋지 않은 코드이다.
 * 우선 이는 전략 패턴에서 다시 알아보자.
 * 결과적으로 상속은 메서드가 아닌 필드를 재사용하려고 할 떄 사용하자.
 *
 * 그리고 상속을 하는게 적절하다 판단되어 상속을 하더라도 주의할 게 있다.
 * 부모가 할 수 있는건 자식도 할 수 있어야 한다는 리스코프 치환 원칙(LSP)을 따라야한다.
 * 리스코프 치환 원칙(LSP)를 지키는 상속이야 말로 진정한 다형성이 있는 상속이 된다.
 * 우선 이는 리스코프 치환 원칙(LSP)에서 다시 알아보자.
 */

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentTypeChild = new Child(); //다형성
        Child child = new Child();

        parent.someMethod();
        parentTypeChild.someMethod();
        //parentTypeChild.anotherMethod(); // Child 인스턴스지만 Parent 타입이라서 호출 불가능
        child.someMethod();
        child.anotherMethod();
    }
}
