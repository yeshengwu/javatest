package test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class SrcLearningTest {

    private List<String> mList;

    private int mTest;

    private List<String> mAsList;

    private static ThreadLocal<Calendar> callThreadLocal;

    public SrcLearningTest() {
        List<String> list = new ArrayList<String>();
        list.add("evan");
        mList = list;
        list.add("listAdd So That mList also changed");
        list.get(0).substring(0, 2);
        list.add("listGet(0).substring do not change mList");
        mTest = 10;

        String[] strings = new String[] { "test1", "test2", "test3" };
        mAsList = Arrays.asList(strings);

        mService = new Service();

        callThreadLocal = new ThreadLocal<Calendar>() {

            @Override
            protected Calendar initialValue() {
                return Calendar.getInstance();
            }
        };

    }

    public long plus(int days) {
        Calendar cal = callThreadLocal.get();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.DATE, days);
        return cal.getTimeInMillis();
    }

    private ArrayList<String> mComponentCallbacks =
            new ArrayList<String>();

    public void registerComponentCallbacks(String callback) {
        synchronized (mComponentCallbacks) {
            mComponentCallbacks.add(callback);
        }
    }

    public void unregisterComponentCallbacks(String callback) {
        synchronized (mComponentCallbacks) {
            mComponentCallbacks.remove(callback);
        }
    }

    public void getData() {
        String[] mStrings = new String[] { "test1", "test2" };
        for (String string : mStrings) {
            String[] strings = new String[1];
            strings[0] = string;
            System.out.println("evan");
        }

    }

    public void printInfo() {
        for (int i = 0; i < mComponentCallbacks.size(); i++) {
            System.out.println("Array:" + mComponentCallbacks.get(i));
        }
        for (int i = 0; i < mList.size(); i++) {
            System.out.println("mList:" + mList.get(i));
        }
        System.out.println("mTest:" + mTest);
        for (int i = 0; i < mAsList.size(); i++) {
            System.out.println("mAsList:" + mAsList.get(i));
        }
    }

    public static String timeToString(int time) {
        String result = "00:00:00";

        time /= 1000;
        int hours = time / 60 / 60;
        int minute = time / 60 % 60;
        int second = time % 60;
        if (time > 0) {
            result = String.format(Locale.US, "%02d:%02d:%02d", hours, minute, second);
        }

        return result;
    }

    public static String[] createFilterYears(int curYear) {
        String[] result = new String[6];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = "全部年份";
            } else {
                result[i] = "" + curYear--;
                if (i == result.length - 1) {
                    curYear = curYear + 2;
                    result[i] = curYear + "以前";
                }
            }
        }
        return result;

    }

    /** 参数TreeMap **/
    Map<String, String> params = new LinkedHashMap<String, String>();

    // /** 参数TreeMap **/
    // TreeMap<String, String> params = new TreeMap<String, String>(
    // new Comparator<Object>() {
    // public int compare(Object o1, Object o2) {
    // if (o1 == null || o2 == null)
    // return 0;
    // else
    // return String.valueOf(o1).compareTo(String.valueOf(o2));
    // }
    // });
    //
    /**
     * 添加参数方法
     * 
     * @param key
     * @param value
     * @return
     */
    public void addParam(String key, String value) {
        if (null == key || "".equals(key) || null == value) {
            // 不作处理
        } else {
            params.put(key.trim(), value.trim());
        }
    }
    
    private String[] getCategroryTags() {
        String[] tags =new String[]{"1","2"};
        String tag ="3";
//        String tag=null;
        if (tag != null) {
            int size = tags.length;
            int newSzie = size + 1;
            String[] newTags = new String[newSzie];
            System.arraycopy(tags, 0, newTags, 0, size);
            newTags[newSzie - 1] = tag;
            for (int i = 0; i < newTags.length; i++) {
//                System.err.println(newTags[i]);
            }
            return newTags;
        }
        return tags;
    }
    
    public <T> T getGenMethodTest(T x){
        System.out.println(x+" getClass().getName()="+x.getClass().getName());
        return x;
    }
    
    public List<String> getGroupAList1(List<String> list){
        System.out.println(list.hashCode());
        
        List<String> locaList=list;
//        list.remove(1);
        List<String> temp=new ArrayList<String>();
        for (int i = 0; i < locaList.size(); i++) {
            if (i==0) {
                temp.add(list.get(i));
            }
        }
        for (String string : temp) {
            System.out.println(string);
        }
        return temp;
    }
    
    public List<String> getGroupAList2(List<String> list){
        System.out.println(list.hashCode());
        List<String> temp=new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (i==1) {
                temp.add(list.get(i));
            }
        }
        for (String string : temp) {
            System.out.println(string);
        }
        
        return temp;
    }
    
    public static final String SERVER_URL = "http://maho.anime.m.kankan.com/";// 外网
    private static final String MOVIE_UPDATE_URL = SERVER_URL + "movies/episodes?ids=%s";
    
    public static void main(String[] args) {
        final SrcLearningTest srcLearningTest = new SrcLearningTest();

        srcLearningTest.getData();
        for (int i = 0; i < srcLearningTest.getCategroryTags().length; i++) {
            System.out.println(srcLearningTest.getCategroryTags()[i]);
        }
        List<String> groupList=new GroupA().getTeStrings();
        System.out.println("groupList hash="+groupList.hashCode());
        srcLearningTest.getGroupAList1(groupList);
        srcLearningTest.getGroupAList2(groupList);
        
        System.out.println("plusDay=" + Util.getDateByUnix(srcLearningTest.plus(2) / 1000));
        
        System.out.println("genTest return T=" +srcLearningTest.getGenMethodTest(10));
        
        try {
            Class<?> classType = Class.forName("java.lang.String");
            System.out.println("classType=" +classType.getName());
        } catch (ClassNotFoundException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        
        Observer one=new Observer() {
            
            @Override
            public void update(Observable o, Object arg) {
                // TODO Auto-generated method stub
                System.err.println("o="+o+" arg="+arg);
            }
        };
        MyObservable observable=new MyObservable();
        observable.setData(11);
        observable.addObserver(one);
        
        observable.notifyObservers(12);
        
        System.err.println("||||="+(0|2));
        System.out.println("||||=" +(512|512));
        
        int len=200;
        List<String> movieIds = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            movieIds.add("4985");
        }
        
        String[] parms = new String[len];
        movieIds.toArray(parms);
        String movieIdss = Util.join(",", parms);
        
        String ress=String.format(MOVIE_UPDATE_URL, movieIdss);
        
        byte[] bytes=ress.getBytes();
        System.err.println(bytes.length);
        System.err.println(ress.length());
        System.err.println(ress);
        
        String test="ab";
        byte[] testbytes=test.getBytes();
        System.err.println(testbytes.length);
        System.err.println(test.length());
        
        long t1=67796992;
        long t2=111481134;
        System.err.println("vall==="+((double)t1/t2));
        

        // boolean isOpen = false;
        // assert isOpen=true; //如果开启了断言，会将isOpen的值改为true
        // System.out.println("isOpen="+isOpen);//打印是否开启了断言
        boolean isOk = 1 < 2;
        assert isOk;
        System.out.println("程序正常");
        
        List<String> list=new ArrayList<>(170000000);
        System.out.println("evan new success");
//      2147483647
        System.err.println("Integer Max="+Integer.MAX_VALUE);

        /* // BaseTask任务测试
         ViewTest viewTest = new ViewTest();
         viewTest.view = new ViewDo();
         viewTest.view.setOnClickListener(viewTest);
         viewTest.view.doInBackground();*/
        
        boolean mOnDeleting = true;
        boolean mOnBatching = true;

        System.err.println("evan===" + (!mOnDeleting & !mOnBatching));
        System.err.println("evan===" + (!mOnDeleting && !mOnBatching));

        // Integer[] data=srcLearningTest.mService.getDatas();
        Integer[] data = new Integer[] {};
        Arrays.sort(data, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2.compareTo(o1);
            }
        });
        for (Integer integer : data) {
            System.out.println("integer=" + integer);
        }

        Integer[] data2 = srcLearningTest.mService.getDatas();
        for (Integer integer : data2) {
            System.out.println("again integer=" + integer);
        }
        
        /*String content = "type=2&qq=1111111111111&content=亲亲&ext4=anime_app&useragent=1.4.0.0|4.4.2|HUAWEI P7-L07";
        System.err.println("1content:" + content);
        byte[] contentBytes;
        try {
            contentBytes = content.getBytes("UTF-8");
//            contentBytes = content.getBytes();
            String newContent = new String(contentBytes);
            System.err.println("2Content:" + newContent);
        } catch (UnsupportedEncodingException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }*/

        /*Object s1 = new String("Hello");
        Object s2 = new String("Hello");
         
        if(s1 == s2) {
          System.out.println("s1 and s2 are ==");
        }else if (s1.equals(s2)) {
          System.out.println("s1 and s2 are equals()");
        }
        
        Object s1 = "Hello";
        Object s2 = "Hello";
         
        if (s1 == s2) {
         System.out.println("s1 and s2 are ==");
        } else if (s1.equals(s2)) {
         System.out.println("s1 and s2 are equals()");
        }*/

        byte[] byte1 = { 'a', 'b', 'c' };
        String str1;
        try {
            str1 = new String(byte1, "UTF-8");
            byte[] byte2 = str1.getBytes("UTF-8");
            boolean isEqual = true;
            for (int i = 0; i < byte1.length; i++) {
                if (byte1[i] != byte2[i]) {
                    isEqual = false;
                }
            }
            if (byte1.length != byte2.length) {
                isEqual = false;
            }
            System.out.println(byte1.length);
            System.out.println(isEqual);
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        String reString = null;
        try {
            reString = new String(byte1, "UTF-8");
            System.out.println("data length=" + byte1.length + " string len=" + reString.length() + " getBytes length="
                    + reString.getBytes("UTF-8").length);
            // return reString;
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        /*MainActi mainActi=new MainActi();
        ITest iTest;
        try {
            iTest = (ITest) mainActi;
        } catch (ClassCastException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            throw new ClassCastException("evan throw and you mainActi must implement the ITest");
        }*/

        /* String md5="2222";
         String teString=null;
         System.out.println("isEqual="+(md5.equals(teString)));*/

        srcLearningTest.printInfo();
        System.out.println("time:" + timeToString(5564480));

        String str = "\u7B2C\u4E8C\u822A\u7A0B\u7684\u51FA\u53D1\u65F6\u95F4\u4E0D\u53EF\u65E9\u4E8E\u7B2C\u4E00\u8202";
        // System.out.println("evdddd->"+str);

        URLDecoder urlDecoder = new URLDecoder();
        try {
            System.out.println("evdddd->" + URLDecoder.decode(str, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*List<Integer> tIntegers=Collections.emptyList();
        System.out.println("tIntegers isNull:" + (tIntegers==null));*/

        String pageLinkTemplate = "http://anime.m.kankan.com/movies/%s";
        String cateUrl = String.format(pageLinkTemplate, "all");

        srcLearningTest.addParam("type", "finished");
        srcLearningTest.addParam("year", "2013");
        srcLearningTest.addParam("order", "new");
        srcLearningTest.addParam("page", "1");

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(cateUrl);
        Iterator iter = srcLearningTest.params.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            urlBuilder.append("/").append(val);
        }
        urlBuilder.append(".json");
        System.out.println("urlBuilder->>>" + urlBuilder.toString());

        Filter filter = new Filter("", "new", "2013", 1);
        filter.setTemplate(cateUrl);
        System.out.println("buildUrl->>>" + filter.buildUrl());
        
        /*//subList改变自己会影响大的外面List
        List<String> outList=new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
          outList.add(""+i);
        }
        for (int i = 0; i < outList.size(); i++) {
            System.out.println("out:" + outList.get(i));
        }
        List<String> subList=outList.subList(0, outList.size());
        for (int i = 0; i < subList.size(); i++) {
            System.out.println("sub:" + subList.get(i));
        }
        subList.add("Evan Change Sub By Add One");
        //        subList.clear();
        //        outList.add("Evan Change Out By Add One"); //java.util.ConcurrentModificationException
        for (int i = 0; i < subList.size(); i++) {
            System.out.println("sub again=:" + subList.get(i));
        }
        for (int i = 0; i < outList.size(); i++) {
            System.out.println("out again=:" + outList.get(i));
        }*/

        /*String[] teStrings=createFilterYears(2013);
        for (int i = 0; i < teStrings.length; i++) {
            System.out.println("e->>>"+teStrings[i]);
        }*/

        /*Map<String, Object> map = new HashMap<String, Object>();  
        map.put("A", 12);  
        map.put("B", '中');  
        map.put("C", "SAP");  
          
        String[] keyArr = map.keySet().toArray(new String[map.size()]);  
        for(int i=0;i<keyArr.length;i++){  
            System.out.println("key:"+keyArr[i]);  
        }  
          
        System.out.println("--------------");  
          
        Object[] valueArr = map.values().toArray(new Object[map.size()]); //new String[ap.size]->new obj.
        for(int i = 0;i<valueArr.length;i++){  
            System.out.println("value:"+valueArr[i]);  
        }  */

        /* Set<String> s=new TreeSet<String>();
         args=new String[4];
         args[0]="s";
         args[1]="a";
         args[2]="b";
         args[3]="d";
         Collections.addAll(s, args);
         //a b d s  
         System.out.println(s);  */

        /*Vector<String> vector=new Vector<>();
        vector.add("evan");
        vector.add("ye");
        Enumeration<String> en=vector.elements();
        while (en.hasMoreElements()) {
            String each = (String) en.nextElement();
            System.out.println("each:" + each);
        }*/

        /*String[] testStrings = new String[10];
        for (int i = 0; i < testStrings.length; i++) {
            testStrings[i] = i + "test";
        }
        List<String> teStrings = new ArrayList<String>();
        for (int i = 0; i < testStrings.length; i++) {
            if (testStrings[i].equals(3 + "test")) {
                teStrings.add(testStrings[i]);
            }
        }
        for (int i = 0; i < teStrings.size(); i++) {
            System.out.println("from:" + teStrings.get(i));
        }
        
        //below crash
        //     String[] ss= (String[]) teStrings.toArray();
        //     System.out.println("to:"+ss);
        //get the new 
        String[] ss=new String[teStrings.size()];
        ss=teStrings.toArray(ss);
        for (int i = 0; i < ss.length; i++) {
           System.out.println("to:"+ss[i]);
        }*/

        /* HashMap<String, String> hashMap=new HashMap<>();
         hashMap.put("D", "value1");
         hashMap.put("C", "value2");
         hashMap.put("Q", "value4");
         hashMap.put("X", "value3");
         
         System.out.println("size:"+hashMap.size());
         Iterator iterator= hashMap.entrySet().iterator();
         while (iterator.hasNext()) {
        //            System.out.println(hashMap.get(iterator.next())); 
           Map.Entry<String, String> entry=  (Entry<String, String>) iterator.next();
           System.out.println(entry.getKey()+" value="+entry.getValue()); 
         }
        //        System.out.println(hashMap.values().toString());
         String[] tex=new String[hashMap.size()];
         hashMap.keySet().toArray(tex);
        //        System.out.println();
         for (int i = 0; i < tex.length; i++) {
             System.out.println(tex[i]);
         }*/

        /*LinkedHashMap<Character, String> charHashMap=new LinkedHashMap<Character, String>();
        charHashMap.put('C', "春");
        charHashMap.put('Q', "秋");
        charHashMap.put('D', "冬" );
        charHashMap.put('X', "夏");
        //有顺序取出key
        System.out.println("size:"+charHashMap.size());
        Character[] tex1=new Character[charHashMap.size()];
        charHashMap.keySet().toArray(tex1);
        for (int i = 0; i < tex1.length; i++) {
            System.out.println(tex1[i]);
        }*/

        /* final String callback_register1 = "callback_register1";
         final String callback_register2 = "callback_register2";
         final String callback_register3 = "callback_register3";
         final String callback_register4 = "callback_register4";
         new Thread(new Runnable() {

             @Override
             public void run() {
                 srcLearningTest.registerComponentCallbacks(callback_register1);
                 srcLearningTest.registerComponentCallbacks(callback_register2);
                 srcLearningTest.registerComponentCallbacks(callback_register3);
                 srcLearningTest.registerComponentCallbacks(callback_register4);
                 srcLearningTest.unregisterComponentCallbacks(callback_register2);
                 srcLearningTest.printInfo();
             }
         }).start();
         new Thread(new Runnable() {

             @Override
             public void run() {
                 srcLearningTest.registerComponentCallbacks(callback_register1);
                 srcLearningTest.registerComponentCallbacks(callback_register2);
                 srcLearningTest.registerComponentCallbacks(callback_register3);
                 srcLearningTest.registerComponentCallbacks(callback_register4);
                 srcLearningTest.unregisterComponentCallbacks(callback_register2);
                 srcLearningTest.printInfo();
             }
         }).start();*/

    }

    private Service mService;

    // private Integer[] getDatas(){
    // mService=new Service();
    // return mService.getDatas();
    // }

    private class Service {
        public Integer[] getDatas() {
            return new Integer[] { 1, 2, 3 };
        }
    }
}
