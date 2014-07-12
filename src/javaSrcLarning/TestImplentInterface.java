package javaSrcLarning;

import innerClass.OutClass1;

public class TestImplentInterface implements ITest {

    @Override
    public int getData() {
        return 10;
    }

    @Override
    public int getData2() {
        return 0;
    }

    public <T extends OutClass1> T getT() {
        return (T) new OutClass1(10, "Outname");
    }

    @Override
    public int getDataBase() {
        return 1110;
    }

    @Override
    public int getDataBase2() {
        return 0;
    }

    @Override
    public ITest removeable(int index) {
        return null;
    }

}
