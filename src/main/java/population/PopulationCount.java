package population;

import java.util.HashMap;
import java.util.Map;

public class PopulationCount
{
    public static Map<String,Integer>city=new HashMap<>();
    public int popCount(String cityName)
    {
        return PopulationCount.pop(cityName);
    }
    public static int pop(String c)
    {
        city.put("Bangalore",1000);
        city.put("Mumbai",1000);
        city.put("Chennai",1000);
        city.put("Pune",1000);
        city.put("Kolkata",1000);
        city.put("Gurgaon",1000);
        return city.get(c);
    }
}
