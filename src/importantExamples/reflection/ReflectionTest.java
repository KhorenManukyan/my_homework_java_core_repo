package importantExamples.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("importantExamples.reflection.Main");

        Main main =(Main) c.newInstance();
        Method m = c.getDeclaredMethod("test",null);
        m.setAccessible(true);
        m.invoke(main, null);
    }
}
