package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public interface Calculation {

    /**
     * @param list1
     * @param list2
     * @return This method returns a integer list of the absolute difference of
     * the values of list1 and list2
     */
    static List<Integer> CalculateAbsoluteDifferences(List<String> list1, List<String> list2) {

        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < list1.size() - 1; i++) {
            int difference = Math.abs(Integer.parseInt(list1.get(i)) - Integer.parseInt(list2.get(i)));
            differences.add(difference);
        }

        return differences;
    }

    /**
     * @param list
     * @return This method returns the index of the smallest value in the given
     * list
     */
    static int GetSmallestValueIndex(List<Integer> list) {

        int smallestDifference = list.get(0);
        int indexOfSmallestDifference = -1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < smallestDifference) {
                smallestDifference = list.get(i);
                indexOfSmallestDifference = i;
            }
        }

        return indexOfSmallestDifference;
    }

}
