package javaSrcLarning;

public class ViewDo {
    private onCLickListener mOnCLickListener;

    private String name;

    public void doInBackground() {

        try {
            System.out.println("doInBackground...");
            Thread.sleep(1500);

            if (mOnCLickListener != null) {
                try {
                    mOnCLickListener.onCLick();
                    // publishProgress(STATUS_SUC, data);
                } catch (Exception e) {
                    // e.printStackTrace();
                    // ViewTest中抛出的异常再这里捕获到
                    System.err.println("ViewDo catch Exception{}  " + e);
                    // publishProgress(STATUS_ERR, e);
                }
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void setOnClickListener(onCLickListener clicklistener) {
        this.mOnCLickListener = clicklistener;
    }

    public interface onCLickListener {
        void onCLick() throws Exception;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            ViewDo other = (ViewDo) obj;
            return name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
