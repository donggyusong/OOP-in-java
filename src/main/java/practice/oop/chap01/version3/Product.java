package practice.oop.chap01.version3;

/**
 * Version3을 보자.
 * 다른 클래스에 있던 총합을 구하는 코드를 Product 클래스로 옮겼다.
 * 이는 Version1,2의 코드들보다 데이터와 함수가 밀접하게 연관되어있다.
 * <p>
 * 그리고 필드에 접근 제어자를 public->private로 바꾸면서 외부에서 직접 접근이 불가능하고
 * 오로지 getTotalAmount()를 통해서만 접근이 가능하다.
 * <p>
 * 이것이 객체지향에서 이야기하는 캡슐화이다.
 * 캡슐화를 이용하면 중복된 코드를 제거하고 데이터와 함수를 강하게 묶어두어 응집력이 높은 코드를 작성할 수 있다.
 */

public class Product {
    private String name;
    private Integer price;
    private Integer amount;

    public Integer getTotalAmount() {
        return this.price * this.amount;
    }
}

class SomeClass {
    public void someMethod(Product product) {
        Integer totalAmount = product.getTotalAmount();

        //어떠한 로직들
    }

    public void anotherMethod(Product product) {
        Integer totalAmount = product.getTotalAmount();
        //어떠한 로직들
    }
}
