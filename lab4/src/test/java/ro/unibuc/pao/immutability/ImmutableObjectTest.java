package ro.unibuc.pao.immutability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ImmutableObjectTest {

    private ImmutableObject obj;

    @BeforeEach
    public void setup() {
        obj = new ImmutableObject(4, new InnerObject(5));
    }

    @Test
    public void test1() {
        Assertions.assertTrue(Modifier.isFinal(ImmutableObject.class.getModifiers()), "Class can be extended");
    }

    @Test
    public void test2() {
        try {
            Method m = ImmutableObject.class.getDeclaredMethod("setI", int.class);
            m.invoke(obj, obj.getI()+1);
            Assertions.assertEquals(4, obj.getI(), "Should not have allowed the set to work");
        }
        catch (NoSuchMethodException setterNotPresent) {
            // all good
        } catch (Exception e) {
            // all good
        }
    }

    @Test
    public void test3() {
        try {
            Method m = ImmutableObject.class.getDeclaredMethod("setInnerObject", InnerObject.class);
            m.invoke(obj, new InnerObject(8));
            Assertions.assertEquals(5, obj.getInnerObject().getSomeField(), "Should not have allowed the set to work");
        }
        catch (NoSuchMethodException setterNotPresent) {
            // all good
        } catch (Exception e) {
            // all good
        }
    }

    @Test
    public void test4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = ImmutableObject.class.getDeclaredMethod("getInnerObject");
        InnerObject o = (InnerObject) m.invoke(obj);
        o.setSomeField(666);
        Assertions.assertEquals(5, obj.getInnerObject().getSomeField(), "Should not permit manipulation of returned object to affect immutable class");
    }

    @Test
    public void test5() {
        InnerObject inner = new InnerObject(3);
        obj = new ImmutableObject(4, inner);
        inner.setSomeField(666);
        Assertions.assertEquals(3, obj.getInnerObject().getSomeField(), "Should not permit manipulation of passed objects to affect immutable class");
    }
}
