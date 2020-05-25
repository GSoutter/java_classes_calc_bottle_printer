import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(2000);
    }

    @Test
    public void getPaper(){
        assertEquals(2000, printer.getPaper());
    }

}
