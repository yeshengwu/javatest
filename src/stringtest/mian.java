package stringtest;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mian {
    public static void main(String[] args) {
        System.out.print("ip2int: " + ip2int("192.168.0.1"));
        System.out.print("int2ip: " + int2ip(166555654));
        System.out.println("cur: " + getCurDate());
        // String notiFalg="2012-12-26";
        // System.out.print("test: "+notiFalg.indexOf(getCurDate()));
        /*getDate();
        String flag="bcaaab";
        System.out.println("test: "+flag.indexOf("aab")); //3
        System.out.println("test: "+flag.lastIndexOf("b")); //5
        
        System.out.println("test: "+flag.lastIndexOf("b")); //5
        
        System.out.println("string2Date: "+string2Date("2012-01-21 15:29:01", STANDARD_DATE_YMD))*/; // 5
        /*RGB(-3263232);
        System.out.println("string2Date__old: "+getDateTimeByMillisecond("1362217847", "1362217847")); //5
        System.out.println("string2Date: "+new Date().toLocaleString()); //5
        System.out.println("string2Date: "+parseDate("2013-3-3 18:08:03")); //5
        */// System.out.println("string2Date: "+parseDate(new Date().toLocaleString())); //5

        // System.out.println("string2Date: "+getUnixDateToDate(Long.valueOf("1362920689000"), false)); //5
        System.out.println("string2Date: " + getTime()); // 5

        // test("1.0","1.3");
        compare("1.82", "1.83");
        // 11111111
        System.out.println("isMobile: " + isMobileNO("18111111111"));

    }

    public static boolean isMobileNO(String mobiles) {

        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(14[~7,\\D])|(18[0-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }

    private boolean filterBitmap(String bitmapPath) {
        // if (TextUtils.isEmpty(bitmapPath)) {
        // return true;
        // }

        int lastIndex = bitmapPath.lastIndexOf(".");
        // System.out.println("lastIndex: "+lastIndex);
        String postfix = "";
        postfix = bitmapPath.substring(lastIndex + 1);
        // System.out.println("postfix: "+postfix);
        if (postfix.equals("gif")) {
            return true;
        }
        return false;
    }

    public static boolean compare(String ver_a, String ver_b) {
        if (ver_a == null || ver_b == null)
            return false;

        int result = ver_a.compareTo(ver_b);
        if (result < 0) {
            System.out.println("版本" + ver_a + "小于版本" + ver_b);
            return true;
        } else if (result > 0) {
            System.out.println("版本" + ver_a + "大于版本" + ver_b);
            return false;
        } else {
            System.out.println("版本" + ver_a + "等于版本" + ver_b);
            return false;
        }
    }

    public static String test(String versionLocal, String versionRemote) {
        System.out.println("versionLocal: " + versionLocal + " versionRemote:" + versionRemote);
        float versionLocalFloat = Float.valueOf(versionLocal);
        float versionRemotelFloat = Float.valueOf(versionRemote);
        System.out.println("versionLocalFloat: " + versionLocalFloat + " versionRemotelFloat:" + versionRemotelFloat);
        return "";
    }

    /**
     * @return unixdate:1362217847
     */
    public static String getTime() {

        String result = "";
        String temp = "cOqZgHwmXMKI VB6TRUvTFRbmOHm4MJ0M4DAcaBqiEPUqcUmvS8FYyJPkw3WRSulUEXbezHaEthXOP9n4DxfpdpdCRGhwFKCPuYTuOVpj7NSx1pHDoknGPfSyM60I3QOETMnRqZokhhrLlsWDVSXmeFF U/IqrgDhJaE1Us5cj4Om85z8lgp7soqOCFNddAC41COK2J8ZEufgZ07PI5t7DSvh/ItJknOrKfT0CC1uYLJjecBvb4yNuEESlP1ZZkHD/nvsAlMJLiAc0At5DedI/4r xOyeGX7u4B6yDwzvrU=";

        result = temp.replaceAll(" ", "+");

        return result;
    }

    /**
     * @return unixdate:1362217847
     */
    public static String getTimeUnixDate() {
        Timestamp appointTime = Timestamp.valueOf(new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss").format(new Date()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = df.parse(String.valueOf(appointTime));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long s = date.getTime();
        String unixDate = String.valueOf(s).substring(0, 10);
        return unixDate;

        /*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date = df.parse(new Date().toLocaleString());  
        long s=date.getTime(); */
    }

    /**
     * @return unixdate:1362217847
     */
    public static String getUnixDateToDate(long unxiDate, boolean isGengzao) {
        DateFormat df = null;
        if (isGengzao) {
            df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        } else {
            df = new java.text.SimpleDateFormat("HH:mm");
        }
        String date = df.format(new java.util.Date(unxiDate));
        return date;
    }

    public static void RGB(int color)
    {

        // int r = 0xFF & color;
        // int g = 0xFF00 & color;
        // g >>= 8;
        // int b = 0xFF0000 & color;
        // b >>= 16;
        int r = (color & 0xff0000) >> 16;
        int g = (color & 0xff00) >> 8;
        int b = (color & 0xff);
        System.out.println("Evan RGB: " + "r:" + r + " g:" + g + " b:" + b);
        // return Color.FromArgb(r, g, b);
    }

    /**
     * * 毫秒转日期字符串 * * @param str * @return
     */
    public static String getDateTimeByMillisecond(String fristTime, String SecondTime) {
        try {
            // Date date = new Date(Long.valueOf(fristTime));
            //
            // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //
            // String time = format.format(date);
            /*
            String dateStr = "";   
            Date date = new Date();   
            //format的格式可以任意   
            //            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");   
            //            DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH/mm/ss");   
            DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
            try {   
            //                dateStr = sdf.format(date);   
            //                System.out.println(dateStr);   
                dateStr = sdf2.format(date);   
                System.out.println(dateStr);   
            } catch (Exception e) {   
                e.printStackTrace();   
            }  
            
            
            Timestamp ts = new Timestamp(System.currentTimeMillis());   
            //            String tsStr = "2011-05-09 11:49:45";   
            //            String tsStr = "2011-05-09 11:49:45";   
            try {   
                ts = Timestamp.valueOf(dateStr);   
                System.out.println("ts:"+ts);   
            } catch (Exception e) {   
                e.printStackTrace();   
            }  */

            // Date date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
            // .parse("2009/12/11 00:00:00");
            // Date date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
            // .parse("1970/01/01 08:00:00");
            // long l = date1.getTime() - date2.getTime() > 0 ? date1.getTime()
            // - date2.getTime() : date2.getTime() - date1.getTime();
            // long rand = (int)(Math.random()*1000);
            // System.out.println("rand: "+rand); //5

            // Timestamp appointTime=Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // Date date = df.parse(String.valueOf(appointTime));
            // long s=date.getTime();
            // String unixDate=String.valueOf(s).substring(0, 10);
            // System.out.println("rand: "+unixDate); //5
            //

            // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // Date date = df.parse(new Date().toLocaleString());
            // long s=date.getTime();
            // System.out.println("rand: "+s); //5

            System.out.println("time" + new Date().getHours() + ":" + new Date().getMinutes());

            if (SecondTime != null) {
                try {
                    long frist = Long.valueOf(fristTime);
                    long second = Long.valueOf(SecondTime);
                    long result = frist - second;
                    // Log.e("fan", frist+"::::"+second+":::"+result);
                    if (result < 30000) {
                        System.out.println("getDateTimeByMillisecond: " + "今天"); // 5
                        return "0";
                    } else if (result > 0 && result < 86400000) {
                        System.out.println("getDateTimeByMillisecond: " + "昨天"); // 5
                        // 昨天
                        return "1";
                    } else if (result > 86400000 && result < 172800000) {
                        System.out.println("getDateTimeByMillisecond: " + "前天或者更早"); // 5
                        // 前天或者更早
                        return "2";
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            System.out.println("getDateTimeByMillisecond: " + "122"); // 5
            return "122";

        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    private static String parseDate(String createTime) {
        try {
            String ret = "";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long create = sdf.parse(createTime).getTime();
            Calendar now = Calendar.getInstance();
            long ms = 1000 * (now.get(Calendar.HOUR_OF_DAY) * 3600 + now.get(Calendar.MINUTE) * 60 + now
                    .get(Calendar.SECOND));// 毫秒数
            long ms_now = now.getTimeInMillis();
            if (ms_now - create < ms) {
                ret = "今天";
            } else if (ms_now - create < (ms + 24 * 3600 * 1000)) {
                ret = "昨天";
            } else if (ms_now - create < (ms + 24 * 3600 * 1000 * 2)) {
                ret = "前天";
            } else {
                ret = "更早";
            }
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final String STANDARD_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将date转换成json中的标准日期String格式
     * 
     * @param date
     * @return
     */
    public static String date2String(Date date) {
        if (null == date) {
            return STANDARD_DATE_FORMAT;
        }
        SimpleDateFormat d = new SimpleDateFormat(
                STANDARD_DATE_YMD);
        String time = d.format(date);
        return time;
    }

    public static final String STANDARD_DATE_YMD = "yyyy-MM-dd";

    /**
     * IP转整型
     * 
     * @param ip
     * @return
     */
    public static long ip2int(String ip) {
        String[] items = ip.split("\\.");
        return Long.valueOf(items[0]) << 24
                | Long.valueOf(items[1]) << 16
                | Long.valueOf(items[2]) << 8 | Long.valueOf(items[3]);
    }

    /**
     * 整型转IP
     * 
     * @param ipInt
     * @return
     */
    public static String int2ip(long ipInt) {
        StringBuilder sb = new StringBuilder();
        sb.append(ipInt & 0xFF).append(".");
        sb.append((ipInt >> 8) & 0xFF).append(".");
        sb.append((ipInt >> 16) & 0xFF).append(".");
        sb.append((ipInt >> 24) & 0xFF);
        return sb.toString();
    }

    /**
     * 得到当天
     * 
     * @return
     */
    public static String getCurDate()
    {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static void getDate()
    {
        // return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        long curr = System.currentTimeMillis();
        long horus = curr / (24 * 60 * 1000);
        long min = curr / (60 * 1000);
        long sec = curr / (1000);
        System.out.println("date:" + horus + " min:" + min + " sec:" + sec);
    }
}
