package az.atlacademy.lesson28;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApi {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        Class<Math> mathClass = Math.class;
//        Method[] declaredConstructors = mathClass.getDeclaredMethods();
//        for (Method declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }

        Class<String> stringClass = String.class;
        Constructor<?>[] declaredConstructors2 = stringClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors2) {
            System.out.println(declaredConstructor);
        }

        Constructor<String> declaredConstructor = stringClass.getConstructor(String.class);
        String samir = declaredConstructor.newInstance("samir");
        System.out.println(samir);

        Constructor<String> declaredConstructor1 = stringClass.getConstructor();
        System.out.println(declaredConstructor1.newInstance());

    }
}
