package lesson7;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Student on 01.08.2016.
 */
public class Lec1 {
    public static void main(String[] args) throws Exception{


        URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {new URL("file:/J:/lecture7/person.jar")},null);
          Class<?> calcClazz = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.CalculatorImpl");
      //  Person person = (Person) persClazz.newInstance();
    //  Method mm =  persClazz.getMethod("info");
       // mm.invoke(persClazz.newInstance(),null);
 Calculator calculator = new CalculatorImpl();
        calculator.calc();
Calculator  calculator_new = (Calculator) calcClazz.newInstance();
        calculator_new.calc();
    }
}
