package privatetest;

import privatetest.test.PatternTest;

public class Pattern {
    public static void main(String[] args) {
        PatternTest patternTest = new PatternTest();
        // 注释的都会报错
        // int a = patternTest.PattenTestProtected;
        // int b= patternTest.PattenTestPrivate;
        // int c = patternTest.PattenTestDefault;
        int d = patternTest.PattenTestPublic;
    }

    public class IQiyiJson {
        public String dm;
        public String dd;
        public String ver;
        public Tkl[] tkl;

    }

    public class Tkl {
        public Vs[] vs;
    }

    public class Vs {
        public int bid;
        public String vid;
        public Fs[] fs;
    }

    public class Fs {
        public String l;
        public long d;
        public long b;
    }

}
