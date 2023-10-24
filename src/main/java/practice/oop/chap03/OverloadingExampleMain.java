package practice.oop.chap03;

/**
 * 오버로딩(중복정의)-Overloading
 * 동일한 메서드 이름으로 된 파라미터,리턴 타입이 다른 메서드를 여러 개 정의하는 것.
 * 이렇게 오버로딩 된 메소드들은 파라미터에 의해 알맞은 메소드를 호출한다.
 */

public class OverloadingExampleMain {
    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();

        int intResult = addCalculator.add(10,20);
        long longResult = addCalculator.add(10L,20L);
        double doubleResult = addCalculator.add(10.0,20.0);

        System.out.println("intResult : "+intResult);
        System.out.println("longResult : "+longResult);
        System.out.println("doubleResult : "+doubleResult);
    }
}
