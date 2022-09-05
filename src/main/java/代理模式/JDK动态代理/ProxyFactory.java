package 代理模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    //获取代理对象的方法
    public SellTickets getProxyObject() {
        /*
         ClassLoader loader 类加载器。用于加载代理类，可以通过目标对象获取类加载器
         Class<?>[] interfaces 代理类实现的接口的字节码对象
         InvocationHandler 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                    Object proxy 代理对象 和 proxyObject 是同一个对象，在invoke方法中基本不用
                    Method method 对接口中的方法进行封装的method对象
                    Object[] args 调用方法的实际参数

                    返回值:方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的服务费用（JDK）");
                        //执行目标对象的方法
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
