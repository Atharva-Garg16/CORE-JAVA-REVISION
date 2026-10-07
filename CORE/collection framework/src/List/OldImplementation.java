package List;

import java.util.ArrayList;
import java.util.List;
import UtilityPrint.printUtil;

import  UtilityPrint.printUtil;

public class OldImplementation {
    public static void main(String[] args) {
        List a=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add("chitu");
        a.add(false);// just like python
        System.out.println(a);
        for (Object o : a) {
            System.out.print(o+" ");
        }
        printUtil.printCollection(a);

    }

}
