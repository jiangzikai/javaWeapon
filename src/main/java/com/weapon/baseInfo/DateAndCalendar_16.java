package com.weapon.baseInfo;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: weapon
 * @Date: 2019/2/13 0013 上午 11:17
 * @Author: jiangzikai
 * @Description:Date日期类和calendar日历类   及关系和日期格式化
 * 参考资料https://www.cnblogs.com/huangminwen/p/6041168.html
 */
public class DateAndCalendar_16 {
    public static void main(String args[]) throws ParseException {
        //Calendar被abstract修饰抽象类，不能使用new方式获得实例，Calendar提供了一个类方法getInstance，
        // 以获得此类型的一个通用的对象，getInstance方法返回一个Calendar对象（该对象为Calendar的子类对象），
        // 其日历字段已由当前日期和时间初始化
        Calendar calendar = Calendar.getInstance();//当前时间
        //基本用法，获取年月日时分秒星期
        int year = calendar.get(Calendar.YEAR);
        // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int month = calendar.get(Calendar.MONTH) + 1;
        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // 获取时
        int hour = calendar.get(Calendar.HOUR);
        // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
        // 获取分
        int minute = calendar.get(Calendar.MINUTE);
        // 获取秒
        int second = calendar.get(Calendar.SECOND);
        // 星期，英语国家星期从星期日开始计算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);//星期日对应1，星期一对应2，星期三-4，
        System.out.println("现在是" + year + "年" + month + "月" + day + "日" + hour + "时"
                + minute + "分" + second + "秒" + "星期" + weekday);


        //一年后的今天
        // 同理换成下个月的今天calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, 1);
//        calendar.add(Calendar.DATE,-1);//前一天，如果当前时间时3月1，上一天是2月最后一天

        int yearOne = calendar.get(Calendar.YEAR);
        int monthOne = calendar.get(Calendar.MONTH) + 1;
        int dayOne = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("一年后的今天：" + yearOne + "年" + monthOne + "月" + dayOne + "日");


        //Calendar和Date类之间的转换calendarDH.setTime(date);  date = calendarDH.getTime();
        String insureStartDate = "2018-01-05";
        Calendar calendarDH = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = sdf.parse(insureStartDate);//String转Date
        calendarDH.setTime(date);//Sets this Calendar's time with the given Date.
        //tecInsurance.setInsurStartdate(Timestamp.valueOf(insureStartDate + " 00:00:00"));// 投保单，保险起期

        calendarDH.add(Calendar.YEAR, 1);//一年之后
        calendarDH.add(Calendar.DATE, -1);//一年之后且前一天
        date = calendarDH.getTime();//日历类转换为Date
        String insureEndDate = sdf.format(date);
        System.out.println("保险起期："+insureStartDate);
        System.out.println("保险止期："+insureEndDate);
        //tecInsurance.setInsurEnddate(Timestamp.valueOf(insureEndDate+ " 23:59:59"));// 投保单，保险止期

        //calendar.add(Calendar.DAY_OF_YEAR, 1);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,1);//后移一天（DAY_OF_YEAE在年的尺度上的第几天，DAY_OF_MONTH在月的尺度上的第几天）
        System.out.println("现在是" + cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH)+1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日" );

    }

    /**
     * 日期转字符串
     * java.util.Date---->String
     * 将java.util.Date对象转化为String字符串
     * @param date 要格式的java.util.Date对象
     * @param strFormat 输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
     * @return 表示日期的字符串
     */
    public static String dateToStr(java.util.Date date, String strFormat) {
        SimpleDateFormat sf = new SimpleDateFormat(strFormat);
        String str = sf.format(date);
        return str;
    }

    /**
     * 字符串转日期
     * String---->java.util.Date
     * 将String字符串转换为java.util.Date格式日期
     * @param strDate 表示日期的字符串
     * @param dateFormat 传入字符串的日期表示格式（如："yyyy-MM-dd HH:mm:ss"）
     * @return java.util.Date类型日期对象（如果转换失败则返回null）
     */
    public static java.util.Date strToUtilDate(String strDate, String dateFormat) {
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
        java.util.Date date = null;
        try {
            date = sf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 时间戳转字符串
     * java.sql.Timestamp---->String
     * 将java.sql.Timestamp对象转化为String字符串
     * @param time 要格式的java.sql.Timestamp对象
     * @param strFormat 输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
     * @return 表示日期的字符串
     */
    public static String dateToStr(java.sql.Timestamp time, String strFormat) {
        DateFormat df = new SimpleDateFormat(strFormat);
        String str = df.format(time);
        return str;
    }

    /**
     * 字符串转时间戳
     * String---->java.sql.Timestamp
     * 将String字符串转换为java.sql.Timestamp格式日期,用于数据库保存
     * @param strDate 表示日期的字符串
     * @param dateFormat 传入字符串的日期表示格式（如："yyyy-MM-dd HH:mm:ss"）
     * @return java.sql.Timestamp类型日期对象（如果转换失败则返回null）
     */
    public static java.sql.Timestamp strToSqlDate(String strDate, String dateFormat) {
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
        java.util.Date date = null;
        try {
            date = sf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Timestamp dateSQL = new java.sql.Timestamp(date.getTime());
        return dateSQL;
    }

    /**
     * 日期转时间戳
     * java.util.Date---->java.sql.Timestamp（用String做中间变量，此方法依赖于上面的方法）
     * 将java.util.Date对象转化为java.sql.Timestamp对象
     *
     * @param date 要转化的java.util.Date对象
     * @return 转化后的java.sql.Timestamp对象
     */
    public static java.sql.Timestamp dateToTime(java.util.Date date) {
        String strDate = dateToStr(date, "yyyy-MM-dd HH:mm:ss SSS");
        return strToSqlDate(strDate, "yyyy-MM-dd HH:mm:ss SSS");
    }

    /**
     * 时间戳转日期
     * java.sql.Timestamp---->java.util.Date（二者是父子关系，可以直接赋值，自动转换）
     * 将java.sql.Timestamp对象转化为java.util.Date对象
     *
     * @param time 要转化的java.sql.Timestamp对象
     * @return 转化后的java.util.Date对象
     */
    public static java.util.Date timeToDate(java.sql.Timestamp time) {
        return time;
    }
    //参考资料https://www.cnblogs.com/zhang-yan/p/7733005.html
}
