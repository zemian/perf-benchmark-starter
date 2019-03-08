package zemian.jmhstarter;

import java.util.ArrayList;
import java.util.HashMap;
import org.openjdk.jmh.annotations.Benchmark;

public class JavaUtilArrayList {
  HashMap<String, Integer> a = new HashMap<>();

  @Benchmark
  public void add() {
    for (int i = 0; i < 1000; i++) {
      a.put("" + i, i);
    }
  }
}
