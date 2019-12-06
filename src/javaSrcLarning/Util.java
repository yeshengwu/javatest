package javaSrcLarning;

import java.text.Collator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Util {

    private static final Collator COLLATOR = Collator.getInstance(Locale.CHINA);

    private static Set<String> sFirstCalls = new HashSet<String>();
    private static final Calendar calendar = Calendar.getInstance();
    private static int sFirstLaunch = -1;

    public static final int MS_FACTOR = 1000;// 服务器时间10位

    private static String mPeerId;
    private static String mIMEI;

    public static int compare(String string1, String string2) {
        return COLLATOR.compare(string1, string2);
    }

    public static int getYear() {
        calendar.setTimeInMillis(System.currentTimeMillis());

        return calendar.get(Calendar.YEAR);
    }

    public static int getYear(long times) {
        calendar.setTimeInMillis(times * MS_FACTOR);

        return calendar.get(Calendar.YEAR);
    }

    public static String getDayOfWeek(long times) {
        calendar.setTimeInMillis(times * MS_FACTOR);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        String day = null;
        switch (week) {
        case Calendar.SUNDAY:
            day = "周日";
            break;

        case Calendar.MONDAY:
            day = "周一";
            break;

        case Calendar.TUESDAY:
            day = "周二";
            break;

        case Calendar.WEDNESDAY:
            day = "周三";
            break;

        case Calendar.THURSDAY:
            day = "周四";
            break;

        case Calendar.FRIDAY:
            day = "周五";
            break;

        case Calendar.SATURDAY:
            day = "周六";
            break;

        default:
            break;
        }

        return day;
    }

    public static boolean timeIsToday(long updateAt) {
        boolean isToday = false;

        calendar.setTimeInMillis(System.currentTimeMillis());
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTimeInMillis(updateAt);// 重置日历

        if (year == calendar.get(Calendar.YEAR) && month == calendar.get(Calendar.MONTH)
                && day == calendar.get(Calendar.DAY_OF_MONTH)) {
            isToday = true;
        }

        return isToday;
    }

    public static boolean timeIsToday(long updateAt, long remoteDate) {
        boolean isToday = false;

        calendar.setTimeInMillis(remoteDate * MS_FACTOR);
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTimeInMillis(updateAt * MS_FACTOR);// 重置日历

        if (year == calendar.get(Calendar.YEAR) && month == calendar.get(Calendar.MONTH)
                && day == calendar.get(Calendar.DAY_OF_MONTH)) {
            isToday = true;
        }

        return isToday;
    }

    /**
     * @param unxiDate
     *            1382683251
     * @return 2013年10月25日 14:40
     */
    public static String getDateByUnix(long unxiDate) {
        DateFormat df = null;
        unxiDate = unxiDate * MS_FACTOR;
        df = new SimpleDateFormat("MM月dd日 HH:mm", Locale.US);
        String date = df.format(new Date(unxiDate));
        if (date.contains("00:00")) {
            int index = date.indexOf("日");
            if (index != -1) {
                date = date.substring(0, index + 1);
            }
        }

        return date;
    }

    public static String getYearRemote(long unxiDate) {
        DateFormat df = null;
        unxiDate = unxiDate * MS_FACTOR;
        df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.US);
        String date = df.format(new Date(unxiDate));
        return date.substring(0, 4);
    }

    public static String getDateTime(String pattern, long times) {
        DateFormat format = new SimpleDateFormat(pattern, Locale.US);
        String dateTime = format.format(new Date(times * MS_FACTOR));

        return dateTime;
    }

    public static String join(String join, String[] array) {
        StringBuilder sb = new StringBuilder();
        if (array != null) {
            for (int i = 0, len = array.length; i < len; i++) {
                sb.append(array[i]);

                if (i < len - 1) {
                    sb.append(join);
                }
            }
        }

        return sb.toString();
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public static String Empty = "";

    public static String insertWhitespace(String src) {
        String newStr = src;
        if (!isNullOrEmpty(src)) {
            if (src.length() == 1) {
                newStr = " " + src + " ";
            } else if (src.length() == 2) {
                newStr = src.substring(0, 1) + " " + src.substring(1);
            }
        }
        return newStr;
    }

    public static List<String> split(String input, String divider, boolean removeEmptyItem) throws Exception {
        if (null == input) {
            throw new Exception("Invalid parameter: input is NULL.");
        }
        List<String> resultItems = new ArrayList<String>();
        String[] rawItems = input.split(divider);
        for (int i = 0; i < rawItems.length; i++) {
            if (!removeEmptyItem || !"".equals(rawItems[i].trim())) {
                resultItems.add(rawItems[i]);
            }
        }

        return resultItems;
    }

}
