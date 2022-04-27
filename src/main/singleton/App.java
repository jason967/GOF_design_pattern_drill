package main.singleton;

public class App {
    public static void main(String[] args) {

        // 새로 생성된 객체이므로 서로 다르다.
        // 생성자를 private로 선언하게 되면 다른 클래스 내에서 settings에 대한 인스턴스를 생성할 수 없게 된다. -> 컴파일 에러 발생
        //Settings settings = new Settings();
        //Settings settings2 = new Settings();

        // 그래서 Settings안에 static한 getInstance method를 생성해서 사용한다.
        Settings settings = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings != settings2);
        //결국 new를 사용해서 인스턴스를 생성하게 되면 싱글톤 패턴을 구현할수 없다.
        //-------------------

        //하지만 app을 만들경우 멀티쓰레드를 사용하게 되는 데 그 때 문제가 발생할 수 있다.


    }
}
