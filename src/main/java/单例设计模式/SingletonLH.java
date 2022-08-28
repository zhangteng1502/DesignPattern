package 单例设计模式;

/**
 * 懒汉式
 * 线程不安全
 */
public class SingletonLH {

    //私有构造方法
    private SingletonLH() {
    }

    //在成员位置创建该类的对象
    private static SingletonLH singletonLH;

    //对外提供静态方法获取该对象
    public static SingletonLH getInstance() {
        if (singletonLH == null) {
            singletonLH = new SingletonLH();
        }
        return singletonLH;
    }
}
