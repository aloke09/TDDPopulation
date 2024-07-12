import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import population.PopulationCount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PopulationTest
{

    public static void pcTest()
    {
        PopulationCount pc=new PopulationCount();
        String city="Kolkata";
        int count = pc.popCount(city);
        assertEquals(count,1000);
    }

    @Test
    public void pcTest1()//blank
    {
        PopulationCount pc=new PopulationCount();
        String city = "";
        Throwable exception = assertThrows(NullPointerException.class,()->pc.popCount(city));
        assertEquals("Cant be blank",exception.getMessage());
//        System.out.println(pc.popCount(city));

    }

    @Test
    public void pcTest2()//key not present
    {
        PopulationCount pc=new PopulationCount();
        String city = "sfdc";
        Throwable exception = assertThrows(NullPointerException.class,()->pc.popCount(city));
        assertEquals("City does not exist in db",exception.getMessage());
    }


}
