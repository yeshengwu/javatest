package javaSrcLarning;

/**
 * @author Evan.Ye
 * @date 2013-10-21
 * @version 1.0.0 http://blog.csdn.net/kiritor/article/details/12215439
 * @Description:try、catch、finally巧遇return
 */
public class ExceptionTest {
    @SuppressWarnings("finally")
    public String test() {
        String returnStr = "start";
        try {
            System.out.println("start String:" + returnStr);
            returnStr = "try innner";
            throw new Exception("inner Exception");
        } catch (Exception e) {
            returnStr = "catch inner";
            return returnStr;
        } finally {
            returnStr = "finally";
            System.out.println("inner finally:" + returnStr);
            return returnStr;
        }
    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            String test = exceptionTest.test();
            Thread.sleep(300);
            System.out.println("returnString:" + test);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
