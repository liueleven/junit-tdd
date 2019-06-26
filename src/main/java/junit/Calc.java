package junit;

import java.util.Random;

/**
 * @description: 一定要写注释啊
 * @date: 2019-06-26 20:15
 * @author: 十一
 */
public class Calc {

    public int exec (String numberStr) {
        String[] split = numberStr.split("\\+");
        int s = 0;
        for (String num : split) {
            int i = Integer.parseInt(num);
            s += i;
        }
        return s;
    }

    public int exec (int count) {
        Random ran = new Random(100);
        int s = 0;
        for (int i = 0; i < count; i++) {
            s += ran.nextInt();
        }
        return s;
    }
}
