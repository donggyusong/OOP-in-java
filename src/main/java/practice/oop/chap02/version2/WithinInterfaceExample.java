package practice.oop.chap02.version2;

/**
 * version1에서는 RealMessageSender에서 FakeMessageSender를 사용하려면 코드를 다음과 같이 직접 수정해야했다.
 * RealMessageSender messageSender = new FakeMessageSender();
 *
 * version2에서는 그럴필요가 없어졌다. 다음과 같이 수정하면 된다.
 * MessageSender messageSender = new FakeMessageSender();
 * Client client = new Client(messageSender);
 *
 * version2에서는 인터페이스를 도입해 다형성을 사용하여 객체 생성 부분만 수정하면 된다.
 * 근데 이러면 version1이든 version2든 결론적으로는 코드를 수정해야한다. 이러면 아무 의미 없는것이 아닌가?
 * 아니다. 지금은 순수 Java만을 이용하고 있지만 OOP 프레임워크인 Spring을 사용하면 Client 인스턴스 생성 시
 * 의존성에 대한 주입을 알아서 해준다.
 *
 * 중요한건 Client의 코드가 변경되지 않았다는거다.
 * version1에서는 CLient에 있던 RealMessageSender와 FakeMessageSender가 계속 수정되어야 했는데
 * version2에서는 MessageSender라는 인터페이스만 사용하고 있어 어떤 구현체가 들어있는지 알지못하고 신경도 안쓴다.
 *
 * 이러한 코드는 전형적인 의존 주입 패턴이라는 디자인 패턴의 일종이다.
 * 이렇게 함으로 Client는 외부에서 어떤 의존성을 사용할 지 선택받으로써 코드 자체는 어떤 구현체에 의존하지 않도록 하는거다.
 */

public class WithinInterfaceExample {
    public static void main(String[] args) {
        MessageSender messageSender = new RealMessageSender();
        Client client = new Client(messageSender);
        client.someMethod();
    }
}
