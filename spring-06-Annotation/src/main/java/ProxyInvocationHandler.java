import com.qi.pojo.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),user.getClass().getInterfaces(),this);
    }
    // 处理代理实例,并且返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
