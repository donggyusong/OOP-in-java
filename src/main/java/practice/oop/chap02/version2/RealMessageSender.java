package practice.oop.chap02.version2;

public class RealMessageSender implements MessageSender{
    @Override
    public void send() {
        //실제로 메세지 보내기
        System.out.println("RealMessageSender-실제로 메세지 보내기");
    }
}
