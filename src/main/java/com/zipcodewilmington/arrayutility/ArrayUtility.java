package com.zipcodewilmington.arrayutility;

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

        return null;
    }

    public Integer getNumberOfOccurrences(genericType valueToEvaluate) {


        return null;
    }

    public genericType getMostCommonFromMerge(genericType[] arrayToMerge) {

        return null;
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
