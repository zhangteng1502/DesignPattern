package 多线程.线程池;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j(topic = "c.TestThreadPool")
public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
                pool.execute(()->{
                    log.debug("1");
                });

    }

}
