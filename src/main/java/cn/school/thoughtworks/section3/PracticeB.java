package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String s : collectionA.keySet()) {
            for (String s2 : object.get("value")) {
                if (s.equals(s2)) {
                    collectionA.put(s,collectionA.get(s)- collectionA.get(s)/3 );
                }
            }
        }
        return collectionA;
    }
}
