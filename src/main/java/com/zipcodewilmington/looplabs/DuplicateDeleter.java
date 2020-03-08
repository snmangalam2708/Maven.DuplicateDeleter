package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    public Integer occurences(T valueToCount, T[] toEval) {
        Integer counter = 0;
        for (int i = 0; i < toEval.length; i++){
            if(toEval[i].equals(valueToCount)){
                counter++;
            }
        }
        return counter;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}
