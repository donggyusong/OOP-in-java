package practice.oop.chap03;

public class Child extends Parent{
    public void anotherMethod(){
        System.out.println("Child anotherMethod");

        this.parentPublicInt = 0;
        this.parentProtectedInt = 0;
        //this.parentPrivateInt = 0;  //private이라 상속 불가능

    }

    /**
     * 참고로 @Overrie는 없어도 된다. 그럼 이게 없다면 무슨일이 벌어지는가?
     * Parent 클래스의 someMethod가 실수로 없어지거나 더 이상 사용하지 않는 메소드가 되어버리면
     * @Overried에 부분에 빨간색 밑줄이 그어진다. 이는 부모 클래스에서 오버라이딩 할 메소드가 없기 때문이다.
     * 보통은 메소드가 없어지는 경우보단 메소드 이름을 오타 칠 경우를 대비해 체크해주는 역할을 해준다.
     */
    @Override
    public void someMethod() {
        System.out.println("Child someMethod");
    }
}
