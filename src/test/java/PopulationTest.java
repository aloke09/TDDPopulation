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
        String city="kolkata";
        int count = pc.popCount(city);
        assertEquals(count,100);
    }


}
