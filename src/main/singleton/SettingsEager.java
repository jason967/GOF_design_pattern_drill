package main.singleton;

public class SettingsEager {
    private SettingsEager() {
    }

    //2. eager initialized(이른 초기화)사용 하기
    //객체를 굳이 나중에 만들어야 되지 않는다, 객체를 생성하는 비용이 그렇게 비싸지 않다 <-일 경우 사용한다.
    private static final SettingsEager INSTANCE = new SettingsEager();

    public static SettingsEager getInstance() {
        return INSTANCE;
    }

}
