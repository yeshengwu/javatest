package javaSrcLarning;

import javaSrcLarning.ViewDo.onCLickListener;

public class ViewTest implements onCLickListener {
    public ViewDo view;

    /* 
     * 抛出后由ViewDo来处理
     */
    @Override
    public void onCLick() throws Exception {
        System.out.println("onClick");
        doRealJob();
    }

    // * 子处理的话则 ViewDo里面就catch不到了
    /* @Override
     public void onCLick() {
         System.out.println("onClick");
         try {
             doResponse();
         } catch (Exception e) {
             // TODO Auto-generated catch block
             System.err.println("doResponse 自己catch Exception{}  " + e);
             // e.printStackTrace();
         }
     }*/

    private void doRealJob() throws Exception {
        System.out.println("doRealJob");
        throw new Exception("evan throw Exception in doRealJob()");
    }

}
