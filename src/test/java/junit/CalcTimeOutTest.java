package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-06-26 20:44
 * @author: 十一
 */
public class CalcTimeOutTest {

    private Calc calc;

    @Before
    public void setUp() {
        calc = new Calc();
    }

    @After
    public void setDown() {
        calc = null;
    }

    /**
     * 超时测试，单位ms
     */
    @Test(timeout = 10)
    public void exec1() {
        int result = calc.exec(1000000);
        Assert.assertNotNull(result);
    }

}
