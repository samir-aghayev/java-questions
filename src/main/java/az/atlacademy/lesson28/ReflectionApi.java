package az.atlacademy.lesson28;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionApi {
    public static void main(String[] args) {
        Person rte = new Person(12, "RTE", "T");
        Class<? extends Person> aClass = rte.getClass();
        Field[] fields = aClass.getFields();
        System.out.println(Arrays.toString(fields));
        System.out.println(aClass.getName());
        System.out.println(aClass.getTypeName());
        System.out.println(aClass.getPackageName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getCanonicalName());
        System.out.println(aClass.toString());
        System.out.println(aClass.descriptorString());
        System.out.println(aClass.descriptorString());
    }

}
