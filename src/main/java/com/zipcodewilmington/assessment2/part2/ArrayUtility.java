package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {


    public Integer [] merge(Integer [] firstArray, Integer [] secondArray){
        Integer [] mergedArray = new Integer[(firstArray.length) + (secondArray.length)];
        for(int x =0; x < firstArray.length; x++){
            mergedArray[x] = firstArray[x];
        }
        int j= 0;
        for(int y = firstArray.length; y < mergedArray.length; y++){
            mergedArray[y] = secondArray[j];
            j++;
        }
        return mergedArray;
    }

    public Integer [] rotate(Integer [] input, int numberOfRotations){
        Integer [] rotatedArray = new Integer[input.length];
            for(int x = 0; x < numberOfRotations; x++){
                rotatedArray[rotatedArray.length-numberOfRotations+x] = input[x];
            }
            int j = 0;
            for(int x = numberOfRotations; x < rotatedArray.length; x++){
                rotatedArray[j] = input[x];
                j++;
        }
        return rotatedArray;
    }



    public Integer countOccurrance(Integer[] array1,Integer[] array2, int valueToEvaluate){
        int count = 0;
        for(int element : array1){
            if(element == valueToEvaluate)
                count++;
        }
        for(int element : array2){
            if(element == valueToEvaluate)
                count++;
        }

        return count;
    }

    public Integer mostCommon(Integer[] array){
        int finalCounter = 0;
        int tempCounter;
        int answer = 0;

        for(int element: array){
            tempCounter = countOccurrance(array, element);
            if(tempCounter > finalCounter){
                finalCounter = tempCounter;
                answer = element;
            }
        }
        return answer;
    }

    public Integer countOccurrance(Integer[] array, int valueToEvaluate){
        int count = 0;
        for(int element : array){
            if(element == valueToEvaluate)
                count++;
        }
        return count;
    }

}
