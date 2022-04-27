package main.singleton;

public class SettingsSync {
    private SettingsSync() {
    }

    private static SettingsSync instance;

    //1. synchronized 키워드 사용하기
    // public static synchronized Settings getInstance() ...
    // 간편하지만 getInstance 메서드 호출할 떄 마다 synchronized(동기화 작업이 수반되어야 해서 성능 이슈가 생길수 있음)
    public static synchronized SettingsSync getInstance() {
        if (instance == null) {
            instance = new SettingsSync();
        }
        return instance;
    }

}
