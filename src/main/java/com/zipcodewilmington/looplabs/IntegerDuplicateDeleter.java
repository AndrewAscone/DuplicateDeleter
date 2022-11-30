package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer[] intArray;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int newArraySize = 0;
        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for (int j = 0; j < intArray.length; j++) {
                if(intArray[i] == intArray[j]){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                newArraySize++;
            }
        }

        Integer[] result = new Integer[newArraySize];
        int marker = 0;

        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for (int j = 0; j < intArray.length; j++) {
                if(intArray[i] == intArray[j]){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                result[marker] = intArray[i];
//                System.out.println("Result array at index " + marker + " now holds " + result[marker]);
                marker++;
            }
        }
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        Integer[] removeDupeArray = new Integer[intArray.length];
        int newArraySize = 0;
        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for (int j = 0; j < intArray.length; j++) {
                if(intArray[i] == intArray[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                newArraySize++;
            }
        }
        //System.out.println(newArraySize);

        Integer[] result = new Integer[newArraySize];
        int marker = 0;

        for (int i = 0; i < intArray.length; i++) {
            int count = 0;
            for (int j = 0; j < intArray.length; j++) {
                if(intArray[i] == intArray[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                result[marker] = intArray[i];
//                System.out.println("Result array at index " + marker + " now holds " + result[marker]);
                marker++;
            }
        }

//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        return result;
    }
}
