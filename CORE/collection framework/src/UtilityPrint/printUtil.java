package UtilityPrint;

import java.util.Collection;

public class printUtil {
    public static <E> void printCollection(Collection<E> collection){
        for (E object : collection){
            System.out.print(object+" ");
        }
    }
}
