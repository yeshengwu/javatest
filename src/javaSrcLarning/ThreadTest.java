package javaSrcLarning;

public class ThreadTest {
    public static void main(String[] args) {
//        try {
//            ThreadA t = new ThreadA(0);
//            new Thread(t).start();
//        } catch (Exception e) {
//            System.out.println("ThreadA out out out run e = " + e);
//        }

        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    /*try {
                        if (1 / 0 == 0) {
                            System.out.println("ThreadA run");
                        }
                    } catch (Exception e) {
                        System.out.println("ThreadA run e = " + e);
                    }*/
                    if (1 / 0 == 0) {
                        System.out.println("ThreadA run");
                    }
                }
            }).start();
        } catch (Exception e) {
            System.out.println("ThreadA out out out run e = " + e);  // 子线程异常，外部catch是没有用的
        }

    }
}
