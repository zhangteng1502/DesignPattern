package 多线程;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

@Slf4j(topic = "c.test")
public class test {

    private static Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (object) {
                log.debug("执行....");
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.debug("其它代码....");
            }
        }).start();
        new Thread(() -> {
            synchronized (object) {
                log.debug("执行....");
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.debug("其它代码....");
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("ss");
            }
        }.start();

//        sleep(2000);
//        log.debug("唤醒 obj 上其它线程");
//        synchronized (object) {
//            object.notifyAll(); // 唤醒obj上一个线程
//           // obj.notifyAll(); // 唤醒obj上所有等待线程
//        }
    }
}
