package by.it.academy.hw10.task1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
    public static void main(String[] args) {
        Set<Integer> iSet1 = new TreeSet<>();
        Collections.addAll(iSet1, 2, 4, 1, 6, 7);
        Collection.printSet("set1", iSet1);
        Set<Integer> iSet2 = new LinkedHashSet<>();
        Collections.addAll(iSet2, 12, 3, 7, 98, 1, 5, 4);
        Collection.printSet("set2", iSet2);
        Set<Integer> iSet3 = Collection.intersect(iSet1, iSet2);
        Collection.printSet("set1 intersect set2", iSet3);
        Collection.printSet("set1 union set2 without intersect", Collection.union(iSet2, iSet1));
    }

}