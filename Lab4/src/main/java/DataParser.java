import models.AssistantEntity;
import models.StafferEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataParser {
        static public Map<String,ArrayList<Object>> Parse(ArrayList<String[]> allData)
        {
            Map<String, ArrayList<Object>> storage = new HashMap<String, ArrayList<Object>>();
            storage.put("Staffer",new ArrayList<Object>());
            storage.put("Assistant",new ArrayList<Object>());

            for (String[] data:allData)
            {
                if(data[0].contains("Staffer"))
                    storage.get("Staffer").add(new StafferEntity(data));
                else
                if(data[0].contains("Assistant"))
                    storage.get("Assistant").add(new AssistantEntity(data));
            }
            return storage;
        }
}
