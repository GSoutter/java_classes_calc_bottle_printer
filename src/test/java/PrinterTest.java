import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(2000, 1000);
    }

    @Test
    public void getPaper(){
        assertEquals(2000, printer.getPaper());
    }

    @Test
    public void canPrintPaperEnough(){
        //given a printer with 2000 sheets
        //when I print 10 copies of 10sheets
        boolean printResult = printer.print(10, 10);
        // then i have 1900 sheets of paper left
        assertEquals(true, printResult);
        assertEquals(1900, printer.getPaper());
    }

    @Test
    public void canPrintPaperNot(){
        //given a printer with 2000 sheets
        //when I print 10 copies of 10sheets
        boolean printResult = printer.print(100, 100);
        // then i have 1900 sheets of paper left
        assertEquals(false, printResult);
        assertEquals(2000, printer.getPaper());
    }


    @Test
    public void getToner(){
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void canPrintPaperEnoughToner(){
        //given a printer with 1000 sheets
        //when I print 10 copies of 10sheets
        boolean printResult = printer.print(10, 10);
        // then i have 1900 sheets of paper left
        assertEquals(true, printResult);
        assertEquals(900, printer.getToner());
    }

    @Test
    public void canPrintPaperNotEnoughToner(){
        //given a printer with 2000 sheets
        //when I print 10 copies of 10sheets
        boolean printResult = printer.print(100, 11);
        // then i have 1900 sheets of paper left
        assertEquals(false, printResult);
        assertEquals(1000, printer.getToner());
    }

}
