package innerClass;

// 静态内剖类：Static Nested Class
public class OutClass1 {
    public int oid;
    public String oname;

    // evan add
    public OutClass1(int oid, String oname) {
        this.oid = oid;
        this.oname = oname;
    }

    public String getValueOut() {
        return oid + "  Out " + oname;
    }

    public String testFinally() {
        String a = "";
        try {
            a = "test";
            return a;
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("finally and hava return clause in try");
        }
        return a;
    }

    // evan add end
    public static class InnerStaticClass1 {
        public int iid;
        public String iname;

        // evan add
        public InnerStaticClass1(int iid, String iname) {
            this.iid = iid;
            this.iname = iname;
        }

        public String getValueIn() {
            return iid + "  in " + iname;
        }
        // evan add end
    }
}
