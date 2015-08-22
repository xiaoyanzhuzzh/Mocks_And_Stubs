package cashregister;

public class PurchaseStub extends Purchase {

    private static int theNumberOfHaveCalled;
    private Item[] items;

    public PurchaseStub(Item[] items) {
        theNumberOfHaveCalled = 0;
        this.items = items;
    }

    @Override
    public String asString() {
        String out = "";

        for (Item item : items) {
            out += item.getName() + "\t" + item.getPrice() + "\n";
        }

        theNumberOfHaveCalled ++;
        return out;
    }

    public int theNumberOfhaveCalled() {
        return theNumberOfHaveCalled;
    }

}
