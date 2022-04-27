package main.singleton;

public class SettingsDoubleCheckedLocking {
    //3. double checked locking 사용하기
    //결국,,, getInstance가 호출 될때만 instance를 생성하고 싶다(즉, 미리 만들어 놓고 싶지 않다)
    private static volatile SettingsDoubleCheckedLocking instance;

    private SettingsDoubleCheckedLocking() {
    }

    public static SettingsDoubleCheckedLocking getInstance() {
        //check 1
        if (instance == null) {
            //Setting.class를 lock으로 사용하겠다.
            synchronized (SettingsDoubleCheckedLocking.class) {
                //check 2
                if (instance == null) {
                    instance = new SettingsDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
