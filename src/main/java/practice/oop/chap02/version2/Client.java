package practice.oop.chap02.version2;

public class Client {
    private MessageSender messageSender;

    public Client(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void someMethod(){
        //메세지 보내기 전 실행되는 어떤 작업

        messageSender.send();
    }

}
