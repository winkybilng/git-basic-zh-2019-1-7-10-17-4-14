package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result  = new HashMap<String, Integer>();

        for (String s : collection1) {
            result.merge(s,1,(oldVal, newVal) -> oldVal + newVal);

        }

        return result;
    }
}
