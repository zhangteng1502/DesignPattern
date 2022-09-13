package 多线程.线程池;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@Slf4j(topic = "c.testTimer")
public class testTimer {
    public static void main(String[] args) {
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(2);
        log.debug("start...");
        pool.scheduleAtFixedRate(()->{
            log.debug("running...");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1,1, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(()->{
            log.debug("running...");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1,1, TimeUnit.SECONDS);
    }
}
