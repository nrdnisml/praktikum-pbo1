package jobsheet12.percobaan;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CobaArrayList1841720060Nurudin {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        /*System.out.println(mListCountry);
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));*/
        System.out.println("Country List");
        Iterator<String> mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s ",element);
        }
    }
}
