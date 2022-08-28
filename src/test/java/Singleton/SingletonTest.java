package Singleton;

import org.junit.Test;
import 单例设计模式.SingletonLH3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    @Test
    public void singletonTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Singleton类的字节码对象
        Class clazz = SingletonLH3.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton类的对象s1
        SingletonLH3 s1 = (SingletonLH3) constructor.newInstance();
        //创建Singleton类的对象s2
        SingletonLH3 s2 = (SingletonLH3) constructor.newInstance();
        //判断通过反射创建的两个Singleton对象是否是同一个对象
        //上面代码运行结果是 false ，表明序列化和反序列化已经破坏了单例设计模式
        System.out.println(s1 == s2);

    }
}
