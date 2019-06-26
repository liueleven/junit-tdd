package junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalcTest {

    Calc calc;
    @Before
    public void setUp() {
        calc = new Calc();
    }

    @After
    public void setDown() {
        calc = null;
    }
    @Test
    public void exec1() {
        int result = calc.exec("1+1");
        Assert.assertEquals(2,result);
    }

    @Test
    public void exec2() {
        int result = calc.exec("2+3+234+1");
        Assert.assertEquals(240,result);
    }

    /**
     * 测试异常
     */
    @Test(expected = NumberFormatException.class)
    public void exec3() {
        int result = calc.exec("2+3.2+234+1");
        Assert.assertEquals(240,result);
    }



}