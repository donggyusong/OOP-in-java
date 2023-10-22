package practice.oop.chap02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice.oop.chap02.version1.Client;
import practice.oop.chap02.version1.FakeMessageSender;
import practice.oop.chap02.version1.RealMessageSender;

public class WithoutInterfaceTest {

    @Test
    @DisplayName("version1")
    public void withoutInterfaceVersion1() {
        ClientTest clientTest = new ClientTest();
        clientTest.someMethod();
    }

    public class ClientTest {
        public void someMethod() {
            //메세지 보내기 전 실행되는 어떤 작업

            //RealMessageSender messageSender = new RealMessageSender();
            FakeMessageSender messageSender = new FakeMessageSender();
            messageSender.send();
        }
    }
}