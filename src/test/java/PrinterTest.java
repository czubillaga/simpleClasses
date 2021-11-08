import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 61.2);
    }

    @Test
    public void hasNumberOfPagesLeft() {
        assertEquals(100, printer.getPagesLeft());
    }

    @Test
    public void canPrint() {
        printer.print(2, 5);
        assertEquals(90, printer.getPagesLeft());
    }

    @Test
    public void willNotPrintWithoutEnoughPaper() {
        printer.print(10, 20);
        assertEquals(100, printer.getPagesLeft());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(61.2, printer.getTonerVolume(), 0.0);
    }

    @Test
    public void willDecreaseTonerWhenPrinting() {
        printer.print(2, 5);
        assertEquals(51.2, printer.getTonerVolume(), 0.0);
    }

    @Test
    public void willOnlyPrintWithEnoughToner() {
        Printer newPrinter = new Printer(100, 9.7);
        newPrinter.print(2, 5);
        assertEquals(100, newPrinter.getPagesLeft());
    }
}
