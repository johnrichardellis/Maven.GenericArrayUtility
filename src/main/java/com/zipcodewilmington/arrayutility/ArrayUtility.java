package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <genericType> {

    // declaring an array of some generic type
    genericType[] anArray;

    public ArrayUtility(genericType[] input) {
        this.anArray = input;
    }


    public genericType[] removeValue(genericType valueToRemove) {

        // making a list to add valuesToStay to, values to remove will not be added
        ArrayList <genericType> valuesThatStay = new ArrayList<>();

        // loop through and add all elements that dont match to valuesThatStay list
        for (genericType element : anArray) {
            if (element != valueToRemove) {
                valuesThatStay.add(element);
            }
        }

        // return valuesThatStay .to an array . copy of anArray with size of the new valuesThatStay array
        return valuesThatStay.toArray(Arrays.copyOf(anArray, valuesThatStay.size()));




//        return null;
    }

    public Integer getNumberOfOccurrences(genericType valueToEvaluate) {
        // originally made another list, but don't need in hindsight
//        ArrayList<genericType> placeToPutValuesThatMatchValueToEvaluate = new ArrayList<>();

        // created counter to count how many times valueToEvaluate appears
        int howManyValuesMatch = 0;

        // looping through checking each element in global anArray declared above
        for (genericType element : this.anArray) {
            if (element == valueToEvaluate) {
//                placeToPutValuesThatMatchValueToEvaluate.add(element); // do not need this in hindsight
                // add the current element to the counter
                howManyValuesMatch++;
            }
        }
        // return the counter count
        return howManyValuesMatch;




//        return null;
    }

    public genericType getMostCommonFromMerge(genericType[] arrayToMerge) {

//        T mostcommon = null;
//
//        for(int i = 0; i < inputArray.length; i++){
//            for(int j = 0; j < arrayToMerge.length; j++){
//                if(inputArray[i] == arrayToMerge[j]){
//                    mostcommon = inputArray[i];
//                }
//            }
//        }
//        return mostcommon;

        // created counter
        genericType mostCommonElement = null;

        // two for loops comparing the elements in each array
        for (int element1 = 0; element1 < anArray.length; element1++) {
            for (int element2 = 0; element2 < arrayToMerge.length; element2++) {

                // if any two elements between the arrays are the same, then add it to mostCommonElement
                if (anArray[element1] == arrayToMerge[element2]) {
                    mostCommonElement = anArray[element1];
                }
            }
        }


        // return the most
        return mostCommonElement;



//        return null;
    }

    // changed parameter types to generic types, this will cover different types of parameters in our tests
    public Integer countDuplicatesInMerge(genericType[] arrayToMerge, genericType valueToEvaluate) {

        // made a counter to see how many times valueToEvaluate orrurs in the two arrays
        int howManyDuplicates = 0;

        // looping through to see how many times valueToEval appears
        for (genericType element : anArray) {
            if (element != valueToEvaluate) {
                continue;
            }
            howManyDuplicates++;
        }

        // looping through to see how many times valueToEval appears
        for (genericType element : arrayToMerge) {
            if (element != valueToEvaluate) {
                continue;
            }
            howManyDuplicates++;
        }

        // returning the final count after looping through both
        return  howManyDuplicates;
    }

}
