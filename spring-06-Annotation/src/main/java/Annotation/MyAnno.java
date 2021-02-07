package Annotation;

import com.qi.pojo.User;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    public abstract int age() default 0;
    String name() default "";
//
//    week show3();
//    Anno show4();
//
//    String[] strs();

}
