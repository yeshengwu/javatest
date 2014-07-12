package test;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestFormat {
    String mString;
    private static int count;

    static {
        count = 10;
        System.out.println("test from static {}");
    }

    public static void main(String[] args) {

        TestFormat testFormat = new TestFormat("evan");
        testFormat.printCount();

        String name = "eie";
        System.out.println("replaceAll=" + name.replaceAll("(?:(?<=[a-z])(?=[A-Z]))|(?:(?<=\\w)(?=[A-Z][a-z]))", "_"));

        // string format的使用
        String POSTER_TEMPLATE_URL = "http://images.movie.xunlei.com/gallery%s";
        System.out.println("ddd:"
                + String.format(Locale.US, POSTER_TEMPLATE_URL, "/986/e32056d5d047b81ee3a169a87609c4f9.jpg"));

        System.out.println(String.format("%1$d个视频", 2));
        String format = "年份：%1$s";
        // String y="未知";
        String y = null;
        // String y="";
        // int y=10;
        // y="未知";
        System.err.println(String.format(format, y));

        // System.out.println(getUnixDateToDate(1334835855000L, true));
        System.out.println(getUnixDateToDate(1402223726, true));/*//没有 L报错，原因参照下面描述
                                                                 System.out.println(getUnixDateToDate(1386633600, true));
                                                                 System.out.println(getUnixDateToDate(1387368592, true));*/
        // System.out.println(getUnixDateToDate(1386633600, true));

        String time = Util.getDateTime("HH:mm", 1387843200);
        System.out.println("time:" + time);

        // System.out.println("result:"+Util.timeIsToday(0));

        /*try {
            getTimestamp();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        long f = 2147483648L;
        int h = 2147483647; // int:四个字节的整数，也是一个有符号的整数， 取值范围：2 147 483 647(-231)~-2 147 483 648(231-1)

        System.out.println("测试pub=" + getUnixDateToDate(1388016000, true));
        System.out.println("up=" + getUnixDateToDate(1388448000, true));
        System.out.println("uped=" + getUnixDateToDate(1387369060, true));
        System.out.println(getUnixDateToDate(1385942400, true));
        System.out.println(getUnixDateToDate(getMoreTime(1385942400), true));

        int b = -1;
        b = (int) (5 * 0.3f);
        System.out.println("ttt=" + b);
        long total = 2414059520L;
        long used = 2370048000L;
        System.out.println("progress=" + (int) (used / (total / 100 + 1)));
        System.out.println("progress=" + (int) (((float) used / (float) total) * 100));
        System.out.println("used size convert=" + size(used) + " used precision convert=" + convertFileSize(used, 2)
                + " used util convert=" + convertStorage(used));
        System.out.println("total size convert=" + size(total) + " total precision convert="
                + convertFileSize(total, 2) + " total util convert=" + convertStorage(total));
        System.out.println("free size convert=" + size(total - used) + " free precision convert="
                + convertFileSize(total - used, 2) + " free util convert=" + convertStorage(total - used));

        /*long t1 = System.currentTimeMillis();
        Integer[] a = { 1, 7, 6 };
        Arrays.sort(a,new Comparator<Integer>() {
                     
                     @Override
                     public int compare(Integer o1, Integer o2) {
                     // TODO Auto-generated method stub
                     return o2.compareTo(o1);
                     }
                     });
        List<String> values = new ArrayList<String>();
        StringBuffer sBuffer = new StringBuffer();

        if (a[0] + 1 != a[1])
            // System.out.print(a[0] + ",");
            // values.add(a[0] + ",");
            sBuffer.append(a[0] + ",");
        else
            // System.out.print(a[0] + "-");
            // values.add(a[0] + "-");
            sBuffer.append(a[0] + "-");
        for (int i = 1; i < a.length - 1; i++) {
            if ((a[i] - 1 != a[i - 1]) & (a[i] + 1 != a[i + 1]))
                // System.out.print(a[i] + ",");
                // values.add(a[i] + ",");
                sBuffer.append(a[i] + ",");
            else if ((a[i] - 1 == a[i - 1]) & (a[i] + 1 != a[i + 1]))
                // System.out.print(a[i] + ",");
                // values.add(a[i] + ",");
                sBuffer.append(a[i] + ",");
            else if ((a[i] - 1 == a[i - 1]) & (a[i] + 1 == a[i + 1]))
                System.out.print("");
            else
                // System.out.print(a[i] + "-");
                // values.add(a[i] + "-");
                sBuffer.append(a[i] + "-");
        }

        // System.out.println(a[a.length - 1]);
        // values.add(""+a[a.length - 1]);
        sBuffer.append("" + a[a.length - 1]);

        // if (isReverse) {
        // Collections.reverse(values);
        // }
        System.out.println(sBuffer.toString());

        String result = values.toString();
        // System.out.println(result);
        // Log.e("evan", "=" + result.substring(1, result.length() - 1));
        System.out.println(result.substring(1, result.length() - 1));
        // return result.substring(1, result.length() - 1);
        // System.out.println(a[a.length - 1]);
        System.out.println("time=" + (System.currentTimeMillis() - t1));*/

        /*  long t2 = System.currentTimeMillis();
          // Integer i[] = { 1, 6,7,10};
          // Integer i[] = { 1, 6,8,10};
          Integer i[] = { 1, 6 };
          // Integer i[] = {2, 1, 3, 5, 6, 7, 8, 10, 12, 14, 16, 17, 18, 19, 21,13};
          // 1 6 7
          Arrays.sort(i);
          List<String> values = new ArrayList<String>();
          int start = i[0];// 记录每一个连续的第一个数
          int begin = i[0];
          for (int k = 0; k < 1000000; k++) { // 计时间
              for (int j = 1; j < i.length; j++) {
                  // System.out.println("j="+j);
                  if (begin + 1 == i[j] && j != i.length - 1) {
                      begin = i[j];
                      continue;
                  }

                  begin = i[j];
                  if (start == begin || (start + 1 != begin && start == i[j - 1] && j != i.length - 1)) {// 没有连续的，只有一个数
                      values.add(String.valueOf(start));
                  } else if (j == i.length - 1 && i[j - 1] == begin - 1) { // 最后一组连续
                      values.add(String.valueOf(start) + "-" + String.valueOf(i[j]));
                  } else { // 最后一组不连续
                      if (start != i[j - 1]) {
                          values.add(String.valueOf(start) + "-" + String.valueOf(i[j - 1]));
                      } else {
                          values.add(String.valueOf(start));
                      }
                      if (j == i.length - 1) {
                          values.add(String.valueOf(i[j]));
                      }
                  }
                  start = begin;
              }
          }
          System.out.println(values);
          long end = System.currentTimeMillis();
          System.out.println("选择法用时去掉打印结果为：" + (end - t2));
          Collections.reverse(values);
          String treString = values.toString();
          System.out.println("eee=" + treString);
          System.out.println("=" + treString.substring(1, treString.length() - 1));*/

        // System.out.println("耗时: " + c.get(Calendar.MINUTE) + "分 " + c.get(Calendar.SECOND) + "秒 " +
        // c.get(Calendar.MILLISECOND) + " 微秒");
        System.out.println("xxxxxxxxxx=" + getListString());
    }

    public static String getListString() {
        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(3);
        lists.add(2);
        String result = lists.toString();
        return result.substring(1, result.length() - 1);
    }

    public static String size(long size) {

        if (size / (1024 * 1024) > 0) {
            float tmpSize = (float) (size) / (float) (1024 * 1024);
            DecimalFormat df = new DecimalFormat("#.##");
            return "" + df.format(tmpSize) + "MB";
        } else if (size / 1024 > 0) {
            return "" + (size / (1024)) + "KB";
        } else
            return "" + size + "B";
    }

    private static final int BASE_B = 1; // 转换为字节基数
    private static final int BASE_KB = 1024; // 转换为KB
    private static final int BASE_MB = 1024 * 1024; // 转换为M的基数
    private static final int BASE_GB = 1024 * 1024 * 1024;

    private static final String UNIT_BIT = "KB";
    private static final String UNIT_KB = "KB";
    private static final String UNIT_MB = "M";
    private static final String UNIT_GB = "G";

    public static String convertFileSize(long file_size, int precision) {
        long int_part = 0;
        double fileSize = file_size;
        double floatSize = 0L;
        long temp = file_size;
        int i = 0;
        int base = 1;
        String baseUnit = "M";
        String fileSizeStr = null;
        int indexMid = 0;

        while (temp / 1024 > 0) {
            int_part = temp / 1024;
            temp = int_part;
            i++;
        }
        switch (i) {
        case 0:
            // B
            base = BASE_B;
            baseUnit = UNIT_BIT;
            break;

        case 1:
            // KB
            base = BASE_KB;
            baseUnit = UNIT_KB;
            break;

        case 2:
            // MB
            base = BASE_MB;
            baseUnit = UNIT_MB;
            break;

        case 3:
            // GB
            base = BASE_GB;
            baseUnit = UNIT_GB;
            break;

        case 4:
            // TB
            break;
        default:
            break;
        }
        floatSize = fileSize / base;
        fileSizeStr = Double.toString(floatSize);
        if (precision == 0) {
            indexMid = fileSizeStr.indexOf('.');
            if (-1 == indexMid) {
                // 字符串中没有这样的字符
                return fileSizeStr + baseUnit;
            }
            return fileSizeStr.substring(0, indexMid) + baseUnit;
        }
        indexMid = fileSizeStr.indexOf('.');
        if (-1 == indexMid) {
            // 字符串中没有这样的字符
            return fileSizeStr + baseUnit;
        }

        if (fileSizeStr.length() <= indexMid + precision + 1) {
            return fileSizeStr + baseUnit;
        }
        if (indexMid < 3) {
            indexMid += 1;
        }
        if (indexMid + precision < 6) {
            indexMid = indexMid + precision;
        }
        return fileSizeStr.substring(0, indexMid) + baseUnit;
    }

    // storage, G M K B
    public static String convertStorage(long size) {
        long kb = 1024;
        long mb = kb * 1024;
        long gb = mb * 1024;

        if (size >= gb) {
            return String.format("%.2f GB", (float) size / gb);
        } else if (size >= mb) {
            float f = (float) size / mb;
            return String.format(f > 100 ? "%.0f MB" : "%.2f MB", f);
        } else if (size >= kb) {
            float f = (float) size / kb;
            return String.format(f > 100 ? "%.0f KB" : "%.2f KB", f);
        } else
            return String.format("%d B", size);
    }

    public static class SDCardInfo {
        public long total;

        public long free;
    }

    public TestFormat(String string) {
        mString = string;
        System.out.println("TestFormat构造器");
    }

    public static long getMoreTime(long date) {
        return date + 24 * 60 * 60;
    }

    /**
     * @return unixdate:1362217847000
     */
    public static String getUnixDateToDate(long unxiDate, boolean isGengzao) {
        DateFormat df = null;
        if (isGengzao) {
            // df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            // df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm");
            // df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm");
            df = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.US);
        } else {
            df = new java.text.SimpleDateFormat("HH:mm");
        }
        /*TimeZone tz = TimeZone.getTimeZone("GMT+7:00");
        df.setTimeZone(tz);*/
        String date = df.format(new java.util.Date(unxiDate * 1000));

        /*String s_nd = date.substring(0, 4); // 年份
        String s_yf = date.substring(5, 7); // 月份
        String s_rq = date.substring(8, 10); // 日期
        String fen = date.substring(11, 17); // 分 HH:mm
        System.out.println("年："+s_nd);
        System.out.println("月："+s_yf);
        System.out.println("日："+s_rq);
        System.out.println("分："+fen);*/

        /*int index=date.indexOf("日");
        System.out.println("index："+index); 
        System.out.println("分："+date.substring(index+1,date.length()));
        System.out.println("date："+date.substring(0,index+1));*/
        return date;
    }

    public void substring(String string) {
        mString = string;
        string.substring(0, string.length() - 1);
    }

    public void printCount() {
        System.out.println("count=" + count);
    }

    public enum data {
        INSTANCE;
    }

    public static String getDateTime(String pattern, long times) {
        DateFormat format = new SimpleDateFormat(pattern, Locale.US);
        String dateTime = format.format(new Date(times));

        return dateTime;
    }

    public static long getTimestamp() throws ParseException {

        Date date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .parse("2009/12/11 00:00:00");
        /* Date date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")  
         .parse("1970/01/01 08:00:00");  
         long l = date1.getTime() - date2.getTime() > 0 ? date1.getTime()  
         - date2.getTime() : date2.getTime() - date1.getTime();  
         long rand = (int)(Math.random()*1000);*/

        System.out.println("rand=" + date1.getTime());
        return 1;
    }

}
