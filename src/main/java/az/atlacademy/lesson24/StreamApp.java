package az.atlacademy.lesson24;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class StreamApp {
    public static void main(String[] args) {
        Function<List<Integer>, IntSummaryStatistics> function = new Function<>() {
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

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        IntSummaryStatistics apply = function.apply(list);
        System.out.println(apply.getMax());
        System.out.println(apply.getMin());
        System.out.println(apply.getSum());
        System.out.println(apply.getAverage());
        System.out.println(apply.getCount());
    }
}
