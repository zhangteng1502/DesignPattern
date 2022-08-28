package 单例设计模式;

/**
 * 饿汉式
 * 静态变量创建类的对象
 * 存在内存浪费问题
 */
public class SingletonEH {
    //私有构造方法
    private SingletonEH(){}

    //在成员位置创建该类的对象
    private static SingletonEH singletonEH = new SingletonEH();

    //对外提供静态方法获取该对象
    public static SingletonEH getInstance(){
        return singletonEH;
    }

}
