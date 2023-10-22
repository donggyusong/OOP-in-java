package practice.oop.chap01.version1;

/**
 * 객체지향을 배워야하는 이유 첫번째 - 캡슐화
 * 객체지향적으로 어떻게 코드가 변하는지 Version별로 알아보면서 캡슐화에 대해 알아보자.
 */

/**
 * Product와 SomeClass 클래스를 보자.
 * "총합을 구하는 코드(Integer totalAmount = product.price * product.amount)"가 중복되는 문제가 있다.
 */

public class Product {
    public String name;
    public Integer price;
    public Integer amount;
}

class SomeClass {

    public void someMethod(Product product) {
        Integer totalAmount = product.price * product.amount; //총합을 구하는 코드

        //어떠한 로직들
    }

    public void anotherMethod(Product product) {
        Integer totalAmount = product.price * product.amount; //총합을 구하는 코드

        //어떠한 로직들
    }
}