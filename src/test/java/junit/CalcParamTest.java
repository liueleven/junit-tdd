package junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcParamTest {

    /**
     * 参数化测试
     * @return
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"1+2",3},{"1+20",21},{"1+2",3}});
    }

    /**
     * 注入对应下标的参数
     */
    @Parameterized.Parameter(0)
    public String input;

    @Parameterized.Parameter(1)
    public int expected;

    private Calc calc;

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
        int result = calc.exec(this.input);
        Assert.assertEquals(this.expected,result);
    }


}