package boundedscroll;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackScrollTest {

    Scroll<String> ab_cd_6; // [A,B] [C,D]:6

    @org.junit.Before
    public void setUp() throws Exception {
        ab_cd_6 = new StackScroll<>(6);
        ab_cd_6.insert("D");
        ab_cd_6.insert("C");
        ab_cd_6.insert("B");
        ab_cd_6.insert("A");
        ab_cd_6.reset();
        ab_cd_6.advance();
        ab_cd_6.advance();
    }

    @Test
    public  void initSetup1(){
        assertEquals(2, ab_cd_6.leftLength());
        assertEquals(2, ab_cd_6.rightLength());
        assertEquals(6, ab_cd_6.capacity());
    }

    @Test
    public void initSetupGetNext(){
        assertEquals("C", ab_cd_6.getNext());
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testException(){
//
//    }
}