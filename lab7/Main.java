package lab7;

import lab6.Planes;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Planes an2 = new Planes(1,1,1,123);
        Planes mria = new Planes(2,2,2,213);
        Planes airbus = new Planes(3,3,3,3);
        Planes helicopter = new Planes(4,4,4,4);
        Planes boeing = new Planes(5,5,5,5);

        MyList myList = new MyList(new Planes(0,0,0,0));
        MyList myList2 = new MyList(an2);
        myList2.add(mria);
        myList.add(an2);
        myList.add(mria);
        myList.add(mria);
        myList.add(airbus);
        myList.add(helicopter);
        myList.add(new Planes(2,2,2,2));
        myList.add(new Planes(1,1,1,1));
        myList.add(new Planes(2,2,2,2));
        myList.add(new Planes(1,1,1,1));
        myList.add(new Planes(2,2,2,2));
        myList.add(new Planes(1,1,1,1));
        myList.add(new Planes(2,2,2,2));
        myList.add(new Planes(1,1,1,1));
        myList.add(new Planes(2,2,2,2));
        myList.add(new Planes(1,1,1,1));
        myList.add(new Planes(5,2,2,1000));

        MyList emptyList = new MyList();
        emptyList.add(new Planes(3,3,3,3));

        ArrayList arrayList = new ArrayList();
        arrayList.add(helicopter);
        arrayList.add(boeing);

        MyList list2 = new MyList(mria);
        
        System.out.println(myList.get(2));
        System.out.println(myList.containsAll(myList2));
        System.out.println(arrayList.contains(boeing));

        myList.removeAll(list2);
        Iterator<Planes> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
