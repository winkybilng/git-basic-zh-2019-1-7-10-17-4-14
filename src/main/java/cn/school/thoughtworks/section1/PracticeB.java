package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<String>();
        for (String s : collection1) {
            for (List<String> list : collection2) {
                for (String s2 : list) {
                    if (s.equals(s2)) {
                        result.add(s);
                    }
                }
            }
        }
        return result;
    }
}
