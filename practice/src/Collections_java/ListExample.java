package Collections_java;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("prajal", "pranjal", "sanskar", "OmShankar"));
        List<String> list = arrayList.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
        System.out.println(list);

        HashMap<String, List<String>> map = new HashMap<>();
        map.put("Group1",Arrays.asList("prajal", "pranjal", "sanskar", "OmShankar"));
        map.put("Group2",Arrays.asList("priya", "pranjal", "sakshi", "Om"));
        map.put("Group3",Arrays.asList("prajal", "pranjal", "sanskar", "OmShankar"));

        List<String> l2=  map.values().stream().flatMap(List::stream).filter(x->x.startsWith("p")).toList();
        System.out.println(l2);

        Map<String,List<String>> m= map.entrySet().
                stream().collect(Collectors.toMap(entry->entry.getKey(), entry-> entry.getValue()
                        .stream().filter(x->x.startsWith("p"))
                        .collect(Collectors.toList())));
        for (Map.Entry<String, List<String>> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
