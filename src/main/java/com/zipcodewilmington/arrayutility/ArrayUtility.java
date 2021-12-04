package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    // declaring an array of some generic type
    public T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }


    public int countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        //given two arrays, count the number of occurrences of valueToEvaluate
        //can either loop through both separately or merge and then loop

        int count = 0;
        for (T element : array) {
            if (element.equals(valueToEvaluate)) {
                count++;
            }
        }
        for (T element : arrayToMerge) {
            if (element.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }


    public T[] removeValue(T valueToRemove) {

        // create new arrayList where elements not matching valueToRemove will be placed
        // loop through original array
        // populate arrayWithValuesRemoved
        // convert arrayList to array
        // return arrayWithValuesRemoved

        Integer removeCounter = getNumberOfOccurrences(valueToRemove);

        Integer counter = 0;

        //create a new array where the length is the length of array minus the value to remove
        T[] arrayWithElementsRemoved = Arrays.copyOf(this.array, this.array.length - removeCounter);

        //loop through the array
        for (T element : array) {
            if (!element.equals(valueToRemove)) {
                //if element is not the value to remove
                // add to new array at position counter (the index, essentially)
                // the current element
                // this is how the array is getting populated
                arrayWithElementsRemoved[counter++] = element;
            }
        }
        //return the array
        return arrayWithElementsRemoved;


    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {

        // loop through array
        // if element = valueToEvaluate
        // update counter
        // return counter

        int counter = 0;

        for (T element : array) {
            if (element.equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;



//        return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        //given 2 arrays
        // count most common element between two arrays

        //created counter
        int counter = 0;
        // variable that will contain the most common element
        T mostCommonElement = null;
        //map that has generic T as key, and the frequency as the value
        Map<T, Integer> frequency = new HashMap<>();

        //loop through first array
        for (T element : array) {
            // takes frequency map and update each time with element as key, and frequency
            // of that element at the value
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);
            // sets current count variable equal to how may times that element has occurred
            int currentCount = frequency.get(element);
            // if currentCount is more than counter
            if (currentCount > counter) {
                // update counter to currentCount value
                counter = currentCount;
                // the new mostCommonElement is the current element
                mostCommonElement = element;
            }
        }
        // same logic as above
        for (T element : arrayToMerge) {
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);
            int currentCount = frequency.get(element);
            if (currentCount > counter) {
                counter = currentCount;
                mostCommonElement = element;
            }
        }
        return mostCommonElement;
//        return null;
    }


}



