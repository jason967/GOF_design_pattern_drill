package main.singleton;

public class SettingsInnerClass {


    private SettingsInnerClass() {
    }

    private static SettingsInnerClass instance;

    private static class SettingsInnerClassHolder {
        private static final SettingsInnerClass INSTANCE = new SettingsInnerClass();
    }

    public static SettingsInnerClass getInstance() {
        return SettingsInnerClassHolder.INSTANCE;
    }

}
