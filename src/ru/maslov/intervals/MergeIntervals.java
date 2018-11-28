package ru.maslov.intervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 3);
        Interval interval2 = new Interval(2, 6);
        Interval interval3 = new Interval(8, 10);
        Interval interval4 = new Interval(15, 14);

        Interval interval11 = new Interval(1, 4);
        Interval interval12 = new Interval(4, 5);

        ArrayList<Interval> list = new ArrayList<Interval>();
//        list.add(interval1);
//        list.add(interval2);
//        list.add(interval3);
//        list.add(interval4);
        list.add(interval11);
        list.add(interval12);


        new MergeIntervals().merge(list);
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null) return null;
        if (intervals.size() < 2) return intervals;

        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });

        int i = 0;
        while (i >= 0 && i < intervals.size() - 1) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i + 1);
            if (i1.end >= i2.start) {
                i1.end = Math.max(i1.end, i2.end);
                intervals.remove(i2);
            } else {
                i++;
            }

        }
        return intervals;
    }
}
