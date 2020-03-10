package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) != 0) {
                result = array[i];
            }
        }
        return result;
    }

    public SomeType findEvenOccurringValue() {

        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) == 0) {
                result = array[i];
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        Integer counter = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        List<SomeType> arr = new ArrayList<>(Arrays.asList(array));
        arr.clear();
        int i = 0;
        for(SomeType t:array){
            if(predicate.apply(t))
                arr.add(array[i]);
            i++;
        }
        SomeType[] newCopy = Arrays.copyOf(array,arr.size());
        return arr.toArray(newCopy);
    }
    }





