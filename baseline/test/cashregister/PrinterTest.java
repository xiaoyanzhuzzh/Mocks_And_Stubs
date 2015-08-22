package cashregister;

public class PrinterTest extends Printer{

    private static int theNumberOfHaveCalled;

    public PrinterTest() {
        theNumberOfHaveCalled = 0;
    }

    @Override
    public void print(String printThis) {
       theNumberOfHaveCalled ++;
    }

    public int theNumberOfHaveCalled() {
        return theNumberOfHaveCalled;
    }
}
