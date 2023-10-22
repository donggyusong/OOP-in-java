package practice.oop.chap02.version1;

/**
 * 서비스 환경에서는 RealMessageSender 사용
 * 테스트 환경에서는 FakeMessageSender 사용
 *
 * 현재는 서비스 환경이라 RealMessageSender messageSender = new RealMessageSender(); 사용했지만
 * 테스트 환경이라면 FakeMessageSender messageSender = new FakeMessageSender();로 바꿔줘야한다.
 *
 * 코드를 서비스 환경과 테스트 환경에 따라서 매번 바꿔주는건 엄청난 비효율이고 자칫 실수해서 버그를 유발할 수 있다.
 * 객체지향으로 이런 문제를 해결할 수 있다. Version2로 가보자.
 */
public class Client {
    public void someMethod(){
        //메세지 보내기 전 실행되는 어떤 작업

        RealMessageSender messageSender = new RealMessageSender();
        messageSender.send();
    }
}
