package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result  = new HashMap<String, Integer>();
        for (String s : collection1) {
            if (s.length() == 1) {
                result.merge(s, 1, (oldVal, newVal) -> oldVal + newVal);
            } else {
                String a[] = s.split("-");
                String ss = a[0];
                int i = Integer.parseInt(a[1]);
                result.merge(ss,i, (oldVal, newVal) -> oldVal + newVal);
            }
        }
        return result;
    }
}
