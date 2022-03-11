import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class Currencyconverter1 {
    private static Currencyconverter obj;

    @BeforeClass
    public static void setObj(){
        obj = new Currencyconverter();
    }

    @Test
    public void test_sek_to_rupees(){
        assertEquals(100,obj.sek_to_rupees(10));
    }

}