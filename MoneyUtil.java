package util;

import java.text.NumberFormat;

/**
 * @Author: lzh
 * @Description:
 * @Date: Created in 2017/8/31 16:30
 */
public class MoneyUtil {

    /**
     * 获取价格的货币样式
     * @param price 价格
     * @return  5.00F --> "￥5.00"
     */
    public static String formatCurrency(float price){
        return NumberFormat.getCurrencyInstance().format(price);
    }
}
