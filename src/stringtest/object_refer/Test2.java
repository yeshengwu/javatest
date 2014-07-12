package stringtest.object_refer;

public class Test2 {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello ");
        // System.out.println("Before change, sb = " + sb);
        Model model = new Model();
        model.setName("test1");
        model.setValue(1);
        System.out.println("Before change, model = " + model);
        // changeData(sb);
        changeData(model);
        System.out.println("After changeData(n), model = " + model);
    }

    public static void changeData(Model strBuf) {
        strBuf.setValue(2);
        strBuf.setName("33");
    }
    // public static void changeData(StringBuffer strBuf) {
    // strBuf.append("World!");
    // }
}
