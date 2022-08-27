package 单例设计模式;


/**
 * 恶汉式
 * 在静态代码块中创建该类对象
 */
public class SingletonEH2 {

    //私有构造方法
    private SingletonEH2(){}

    //在成员位置创建该类的对象
    private static SingletonEH2 singletonEH2;

    static {
        singletonEH2 = new SingletonEH2();
    }

    //对外提供静态方法获取该对象
    public static SingletonEH2 getInstance(){
        return singletonEH2;
    }
}
