package java8.Lambda表达式;

import lombok.extern.slf4j.Slf4j;

import java.util.function.IntBinaryOperator;

@Slf4j(topic = "c.基本格式")
public class 基本格式 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.debug("一会去吃饭");
            }
        }).start();
        new Thread(()->{
            log.debug("吃啥");
        }).start();

        int i = calculaNum((int a, int b) -> {
            return a * b;
        });
        System.out.println(i);

    }


    public static  int calculaNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }

}
