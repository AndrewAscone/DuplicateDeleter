package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    String[] stringArray;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.stringArray = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int newArraySize = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int count = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if(Objects.equals(stringArray[i], stringArray[j])){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                newArraySize++;
            }
        }

        String[] result = new String[newArraySize];
        int marker = 0;

        for (int i = 0; i < stringArray.length; i++) {
            int count = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if(Objects.equals(stringArray[i], stringArray[j])){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                result[marker] = stringArray[i];
//                System.out.println("Result array at index " + marker + " now holds " + result[marker]);
                marker++;
            }
        }

        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int newArraySize = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int count = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if(Objects.equals(stringArray[i], stringArray[j])){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                newArraySize++;
            }
        }

        String[] result = new String[newArraySize];
        int marker = 0;

        for (int i = 0; i < stringArray.length; i++) {
            int count = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if(Objects.equals(stringArray[i], stringArray[j])){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                result[marker] = stringArray[i];
//                System.out.println("Result array at index " + marker + " now holds " + result[marker]);
                marker++;
            }
        }

        return result;
    }
}
