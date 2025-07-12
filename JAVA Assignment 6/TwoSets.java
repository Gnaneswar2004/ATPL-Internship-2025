import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("The Intersection of Two Sets is : " + intersectionSet);
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("The Union of Two Sets is : " + unionSet);
        Set<Integer> differenceSet1 = new HashSet<>(set1);
        differenceSet1.removeAll(set2);
        System.out.println("The Difference between Two Sets is : (set1 - set2) : " + differenceSet1);
        Set<Integer> differenceSet2 = new HashSet<>(set2);
        differenceSet2.removeAll(set1);
        System.out.println("The Difference between Two Sets is : (set2 - set1) : " + differenceSet2);
    }
}