import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Student on 28.07.2016.
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException, InstantiationException {
      Field f= C.class.getDeclaredField("str");
        f.setAccessible(true);
        if (f.isAnnotationPresent(ValidLength.class)){
            System.out.println("Есть аннотация"+ ValidLength.class.getTypeName());
            ValidLength vLen = f.getAnnotation(ValidLength.class);
            if(vLen.value() != ((String) f.get(C.class.newInstance())).length()){
                System.out.println("длина некоректна");
            }
        }

    }
}
