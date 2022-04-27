package main.singleton;

public class Settings {
    private Settings() {
    }

    private static Settings instance;

    public static Settings getInstance() {
        //하지만 문제는 이 클래스 메서드안에서 new가 사용되었다.-> 결국 매번 다른 객체가 생성된다.
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

}
