package testPrivate.test;

public class PatternTestSub extends PatternTest {
    public static void main(String[] args) {
    }

    private int getDate() {
        int a = PattenTestProtected;
        int b = PattenTestPublic;
        int c = PattenTestDefault;
        // int d = PattenTestPrivate;
        return a;
    }
}
