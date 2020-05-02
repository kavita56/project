
package com.cook.first_maven_project;


import org.junit.Test;
import static org.junit.Assert.*;

public class NewClassTest {
    
    @org.junit.Test
    public void testSomeMethod() {
       NewClass obj=new NewClass();
       int result=obj.add(1,2);
       int expected=5;
       assertEquals(result,expected);
    }
    
}
