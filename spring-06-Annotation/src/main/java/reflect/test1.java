package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test1 {
    public String name;
    public int age;
    public void func()
    {
        System.out.println("Hello world");
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String name = test1.class.getName();
        System.out.println(name);
        System.out.println("*****");
        Method method = test1.class.getMethod("func");
        method.invoke(new test1());
    }
}
