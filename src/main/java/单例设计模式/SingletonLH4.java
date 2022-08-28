package 单例设计模式;

/**
 * 静态内部类方式
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态
 * 内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。静态属性由于被
 * static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *
 * 第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加
 * 载SingletonHolder
 * 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任
 * 何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
public class SingletonLH4 {

    //私有构造方法
    private SingletonLH4() {
    }

    private static class SingletonHolder {
        private static final SingletonLH4 SINGLETON_LH_4 = new SingletonLH4();
    }

    //对外提供静态方法获取该对象
    public static SingletonLH4 getInstance() {
        return SingletonHolder.SINGLETON_LH_4;
    }
}
