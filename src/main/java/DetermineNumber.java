import java.util.HashMap;
import java.util.Map;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *
 * 数值（按顺序）可以分成以下几个部分：
 *
 * 若干空格
 * 一个小数或者整数
 * （可选）一个'e'或'E'，后面跟着一个整数
 * 若干空格
 * 小数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 下述格式之一：
 * 至少一位数字，后面跟着一个点 '.'
 * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 * 一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 至少一位数字
 *
 */
public class DetermineNumber {

    /**
     * 将合法的字符串a[i]对应一个映射表
     *
     * 表示       缩写      含义      字符
     * blank              空格        ‘ ’
     * sign      s        正负号      ‘+’，‘-’
     * digit     d        数字       ‘0’ ~ ‘9’
     * dot       .        小数点      '.'
     * e         e        幂等号      ‘e’, 'E'
     *
     * 状态表
     * 状态           描述
     * 0             起始的 blank
     * 1             e之前的sign
     * 2             dot之前的digit
     * 3             dot之后的digit
     * 4             当dot前为空时，dot后的digit
     * 5             e
     * 6             e之后的sign
     * 7             e之后的digit
     * 8             尾部的blank
     *
     * @return
     */
//    public boolean isNumber() {
//        Map[] states = {
//                new HashMap() {{ put(' ', 0); put ('s', 1);
//                ;put('d', )}},
//
//
//        };
//    }

}
