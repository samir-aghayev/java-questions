package az.atlacademy.lesson24;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class StreamApp {
    public static void main(String[] args) {
        Function<List<Integer>, IntSummaryStatistics> function = new Function<List<Integer>, IntSummaryStatistics>() {
            @Override
            public IntSummaryStatistics apply(List<Integer> integers) {
                long count = integers.size();
                int min = integers.get(0);
                int max = integers.get(0);
                long sum = integers.get(0);
                for (int i = 0; i < count; i++) {
                    if (min > integers.get(i)) {
                        min = integers.get(i);
                    }
                    if (max < integers.get(i)) {
                        max = integers.get(i);
                    }
                    sum += integers.get(i);
                }
                return new IntSummaryStatistics(count, min, max, sum);
            }
        };

    }
}
