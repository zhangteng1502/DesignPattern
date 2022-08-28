package 单例设计模式;

/**
 * 双重检查方式
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题
 */
public class SingletonLH3 {

    //私有构造方法
    private SingletonLH3() {
    }

    //对外提供静态方法获取该对象
    //volatile 关键字可以保证可见性和有序性
    private static volatile SingletonLH3 singletonLH3;

    //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
    public static SingletonLH3 getInstance() {
        if (singletonLH3 == null) {
            synchronized ((SingletonLH3.class)) {
                //抢到锁之后再次判断是否为null
                if (singletonLH3 == null) {
                    singletonLH3 = new SingletonLH3();
                }
            }
        }
        return singletonLH3;
    }
}
