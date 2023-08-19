package JavaW4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTheory {
    public static void main(String[] args) {

        // Sets
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 3, 5));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 5, 7));
        HashSet<Integer> setC = new HashSet<>(Arrays.asList(5, 7, 9));

        // Calculate Union
        Set<Integer> unionResult = getUnion(getUnion(setA, setB), setC);
        System.out.println("Union: " + unionResult);

        // Calculate Intersection
        Set<Integer> intersectionResult = getIntersection(getIntersection(setA, setB), setC);
        System.out.println("Intersection: " + intersectionResult);

        // Calculate Difference
        Set<Integer> differenceResult = getDifference(getDifference(setA, setB), setC);
        System.out.println("Difference: " + differenceResult);
    }

    public static Set<Integer> getUnion(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        return union;
    }

    public static Set<Integer> getIntersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        return intersection;
    }

    public static Set<Integer> getDifference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        return difference;
    }
}