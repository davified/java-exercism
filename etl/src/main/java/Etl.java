import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
  HashMap<String, Integer> transform(Map<Integer, List<String>> old) {
    HashMap<String, Integer> output = new HashMap<>();
    for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
      List<String> array = entry.getValue();
      for (int i = 0; i < array.size(); i++) {
        String key = array.get(i).toLowerCase();
        Integer value = entry.getKey();
        output.put(key, value);
      }
    }
    return output;
  }

}
