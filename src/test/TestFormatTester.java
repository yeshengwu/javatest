package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFormatTester extends TestCase {

    private TestFormat testFormat;

    public TestFormatTester(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testFormat = new TestFormat("evan");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testRead() {
        System.out.println(testFormat.mString);

    }

    public void testReadAndSet() {
        testFormat.substring("substring");
        System.out.println(testFormat.mString);

    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestFormatTester("testRead"));
        suite.addTest(new TestFormatTester("testReadAndSet"));
        return suite;

    }

    public static void main(String[] args) {
        // junit.textui.TestRunner.run(suite());// 文字界面
        junit.textui.TestRunner.run(new TestSuite(TestFormatTester.class));// 自动把包含 "test"开头的方法都当作测试用例来执行
        // junit.swingui.TestRunner.run(TestFormatTester.class);//gui
    }

}
