package practice.oop.chap02.version2;

public class FakeMessageSender implements MessageSender{
    @Override
    public void send() {
        //실제로 메세지 보내지 않음
        System.out.println("FakeMessageSender-실제로 메세지 보내지 않음");
    }

}
