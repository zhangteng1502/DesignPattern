package 单例设计模式;

import java.io.Serializable;

public class SingletonSeria implements Serializable {

    private SingletonSeria(){
    }

    private static class SingletonHolder {
        private static final SingletonSeria SINGLETON_SERIA = new SingletonSeria();
    }

    //对外提供静态方法获取该对象
    public static SingletonSeria getInstance() {
        return SingletonSeria.SingletonHolder.SINGLETON_SERIA;
    }
}
