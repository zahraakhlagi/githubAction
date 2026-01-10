package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {

    @Test
    public void testAdd(){
        MyClass myClass= new MyClass();

        assertEquals(3, myClass.add(1,2));
    }

}
