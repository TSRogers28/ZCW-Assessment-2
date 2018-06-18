package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {

    Map<String, String> testMap = new LinkedHashMap<>();

    public void add(String path, String controller) {

        testMap.put(path,controller);
    }

    public int size(){
        return testMap.size();
    }


    public String getController(String path) {
        return testMap.get(path);
    }

    public void update(String path, String studentController) {
         testMap.replace(path, studentController);
    }

    public void remove(String path) {
        testMap.remove(path);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        List<String> keyList = new ArrayList(testMap.keySet());
        Collections.reverse(keyList);
        for(String key: keyList)
           builder.append(key + " -> " + testMap.get(key) + "\n");
        return builder.toString();
    }
}
