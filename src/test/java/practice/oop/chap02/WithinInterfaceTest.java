package practice.oop.chap02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice.oop.chap02.version2.Client;
import practice.oop.chap02.version2.FakeMessageSender;
import practice.oop.chap02.version2.MessageSender;
import practice.oop.chap02.version2.RealMessageSender;

public class WithinInterfaceTest {

    @Test
    @DisplayName("version2-인터페이스 도입")
    public void withinInterfaceVersion2(){
        MessageSender messageSender = new FakeMessageSender();
        Client client = new Client(messageSender);
        client.someMethod();
    }
}

