package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer[] newArray = super.array;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Stream<Integer> myStream = Arrays.stream(newArray);
        Predicate<Integer> predicateInt = i -> (super.occurences(i, newArray) < maxNumberOfDuplications);
        return myStream.filter(predicateInt).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<Integer> myStream = Arrays.stream(newArray);
        Predicate<Integer> predicateInt = i -> (super.occurences(i, newArray) != exactNumberOfDuplications);

        return myStream.filter(predicateInt).toArray(Integer[]::new);
    }
}
