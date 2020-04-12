package com.hyungilee.unittestandroid;

public class SingletonJava {

    //생성자를  private로 감춘다.
    private SingletonJava(){}

    //생성된 객체를 private로 감추고 프로그램 시작할 때 초기화한다.
    //인스턴스 생성방법은 처음 사용할때 초기화하는 방법, 쓰레드 동기화 방법등 다양한 방법이 있다.
    //자세한 것은 디자인 패턴 관련 서적 참고.
    //프로그램 시작 시 객체를 생성하여 'static'으로 선언된 클래스 변수에 할당
    private static SingletonJava instance = new SingletonJava();

    //외부에서 생성된 instance 에서 접근 할 수 있는 방법을 제공
    //이미 생성된 객체를 반환한다.
    public static SingletonJava getInstance(){
        return instance;
    }

    public void log(String text){
        System.out.println(text);
    }
}
