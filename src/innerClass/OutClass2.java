package innerClass;

// ·Ç¾²Ì¬ÄÚÆÊÀà£ºInner Class
public class OutClass2 {
    public int oid;
    public String oname;

    // evan add
    public OutClass2(int oid, String oname) {
        this.oid = oid;
        this.oname = oname;
    }

    public String getValueOut() {
        return oid + "  Out " + oname;
    }

    // evan add end

    public class InnerClass2 {
        public int iid;
        public String iname;

        // evan add
        public InnerClass2(int iid, String iname) {
            this.iid = iid;
            this.iname = iname;
        }

        public String getValueIn() {
            return iid + "  in " + iname;
        }
        // evan add end

    }
}
