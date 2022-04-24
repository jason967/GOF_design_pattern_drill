package main.singleton;

public class Settings {
//    private Settings(){}
//    private static Settings instance;
//
//    public static Settings getInstance(){
//        //하지만 문제는 이 클래스 메서드안에서 new가 사용되었다.-> 결국 매번 다른 객체가 생성된다.
//        if(instance==null){
//            instance = new Settings();
//        }
//        return instance;
//    }

    //쓰레드 세이프한 싱글톤 구현하기

    //1. synchronized 키워드 사용하기
    // public static synchronized Settings getInstance() ...
    // 간편하지만 getInstance 메서드 호출할 떄 마다 synchronized(동기화 작업이 수반되어야 해서 성능 이슈가 생길수 있음)
    //    private static Settings instance;
    //
    //    public static synchronized Settings getInstance(){
    //        if(instance==null){
    //            instance = new Settings();
    //        }
    //        return instance;
    //    }


    //2. eager initialized(이른 초기화)사용 하기
    //객체를 굳이 나중에 만들어야 되지 않는다, 객체를 생성하는 비용이 그렇게 비싸지 않다 <-일 경우 사용한다.
    //    private static final Settings INSTANCE = new Settings();
    //
    //    public static Settings getInstance(){
    //        return INSTANCE;
    //    }

    //결국,,, getInstance가 호출 될때만 instance를 생성하고 싶다(즉, 미리 만들어 놓고 싶지 않다)
    //3. double checked locking 사용하기
    //    private static volatile Settings instance; // <= 1.5 버전 이상에서는 volatile 키워드를 넣어줘야 정상 작동한다.
    //
    //    private Settings(){}
    //
    //    //synchronized에 대해서 공부해보자
    //    public static Settings getInstance(){
    //        //check 1
    //        if(instance == null){
    //            //Settings.class를 Lock으로 사용하겠다.
    //            synchronized (Settings.class){
    //                //check 2
    //                if(instance==null){
    //                    instance = new Settings();
    //                }
    //            }
    //        }
    //        return instance;
    //    }

    //4. static inner class 사용하기
    private Settings(){}

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }


}
