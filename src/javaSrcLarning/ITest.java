package javaSrcLarning;

public interface ITest extends ITestBase {
    public int getData();

    abstract int getData2();

    /**
     * @param index
     * @return ITest
     */
    public ITest removeable(int index);
}
