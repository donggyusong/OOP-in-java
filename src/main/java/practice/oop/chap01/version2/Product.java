package practice.oop.chap01.version2;

/**
 * Version1에서 발생한 "총합을 구하는 코드" 중복되는 코드를 ProductFunctions 클래스의 메소드로 만들어 개선하였다.
 * 유지보수면에서 조금 더 나아졌다.
 * 하지만 ProductV2 클래스와 ProductFunctions 클래스와의 연관관계가 높다고 말할 수 없다.
 */

public class Product {
    public String name;
    public Integer price;
    public Integer amount;

}

class ProductFunctions {
    public static Integer getTotalAmount(Product product) {
        //총합을 구하는 코드
        return product.price * product.amount;
    }
}

class SomeClass {
    public void someMethod(Product product) {
        Integer totalAmount = ProductFunctions.getTotalAmount(product);

        //어떠한 로직들
    }


    public void anotherMethod(Product product) {
        Integer totalAmount = ProductFunctions.getTotalAmount(product);

        //어떠한 로직들
    }
}
