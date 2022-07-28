package proxy;

/**
 * 具体实现类， 目标对象
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething() {
        System.out.println("real");
    }
}
