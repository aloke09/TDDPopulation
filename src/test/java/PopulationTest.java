import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import population.PopulationCount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PopulationTest
{
    @Test
    public void pcTest()
    {
        PopulationCount pc=new PopulationCount();
        String city="Kolkata";
        int count = pc.popCount(city);
        assertEquals(count,1000);
    }

    @Test
    public void pcTest1()
    {
        PopulationCount pc=new PopulationCount();
        String city = "";
        pc.popCount(city);
    }

    @Test
    public void pcTest2()
    {
        PopulationCount pc=new PopulationCount();
        String city = "sfdc";
        pc.popCount(city);
    }


}
