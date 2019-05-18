package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3  = new HashMap<String, Integer>();
        for (String s : collectionA) {
            collection3.merge(s, 1, (oldVal, newVal) -> oldVal + newVal);
        }

        for (String s : collection3.keySet()) {
            for (String s2 : object.get("value")) {
                if (s.equals(s2)) {
                    collection3.put(s,collection3.get(s)- collection3.get(s)/3 );
                }
            }
        }

        return collection3;
    }
}
