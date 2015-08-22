package cashregister;

import org.junit.Test;
import org.mockito.Mock;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CashRegisterTest {

    @Test
    public void shouldPrintInformationOfPrinter() {

        PrinterTest printerTest = new PrinterTest();
        CashRegister cashRegister = new CashRegister(printerTest);

        Item[] items = {new Item("hello", 12.0), new Item("hi", 23.0)};

        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);

        assertEquals(1, printerTest.theNumberOfHaveCalled());
    }

    @Test
    public void shouldReturnOneWhenPrinterTestHaveBeenCalled() {

        PrinterTest printerTest = new PrinterTest();
        CashRegister cashRegister = new CashRegister(printerTest);

        Item[] items = {new Item("hello", 12.0), new Item("hi", 23.0)};

        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);

        assertEquals(1, printerTest.theNumberOfHaveCalled());
    }

    @Test
    public void shouldReturnZeroWhenProcessHaveBeenCalled() {

        PrinterTest printerTest = new PrinterTest();
        CashRegister cashRegister = new CashRegister(printerTest);

        Item[] items = {new Item("hello", 12.0), new Item("hi", 23.0)};

        PurchaseStub purchaseStub = new PurchaseStub(items);
        cashRegister.process(purchaseStub);

        assertEquals(1, printerTest.theNumberOfHaveCalled());
        assertEquals(1, purchaseStub.theNumberOfhaveCalled());
    }

    @Test
    public void shouldTestCashRegisterWithMockito() {
        Printer printer = mock(Printer.class);
    }

//    @Test
//    public void shouldTestPrinterWithMocklled() {
//
//        PrinterMock printerMock = new PrinterMock();
//        CashRegister cashRegister = new CashRegister(printerTest);
//
//        Item[] items = {new Item("hello", 12.0), new Item("hi", 23.0)};
//
//        PurchaseStub purchaseStub = new PurchaseStub(items);
//        cashRegister.process(purchaseStub);
//
//        assertEquals(1, printerTest.theNumberOfHaveCalled());
//        assertEquals(1, purchaseStub.theNumberOfhaveCalled());
//    }

}
