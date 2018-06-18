package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ListUtility {

    List<Integer> testList = new ArrayList<>();


    public boolean add(int i) {
        testList.add(i);

        return (testList.size() == 1);
    }

    public int size() {

        return testList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueSet = new LinkedHashSet<>(testList);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        return uniqueList;
    }

    public Integer countOccurrance(List<Integer> array, int valueToEvaluate) {
        int count = 0;
        for (int element : array) {
            if (element == valueToEvaluate)
                count++;
        }
        return count;
    }

    public String join() {

        return testList.toString().replaceAll("\\[", "").replaceAll("\\]", "");
    }

    public Integer mostCommon() {
        int finalCounter = 0;
        int tempCounter;
        int answer = 0;

        for (int element : testList) {
            tempCounter = countOccurrance(testList, element);
            if (tempCounter > finalCounter) {
                finalCounter = tempCounter;
                answer = element;
            }
        }
        return answer;
    }

}
