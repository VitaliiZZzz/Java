package lab7;

import lab6.Planes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<Planes> {
    public int initialCapacity = 15;
    private double increasingPercent =  1.3;
    private Planes[] elements = new Planes[initialCapacity];
    private int size = 0;

    public MyList(){}

    public MyList(Planes planes){
        add(planes);
    }

    public MyList(Collection<? extends Planes> collection){
        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Planes planes : this) {
            if (o.equals(planes)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Planes> iterator() {
        return new Iterator<Planes>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Planes next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return elements;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Planes planes) {
        if(size==initialCapacity){
            initialCapacity = (int) Math.floor(initialCapacity*increasingPercent);
            Planes [] tmp = new Planes[initialCapacity];
            for(int i =0 ; i< elements.length; i++){
                tmp[i] = elements[i];
            }
            elements = tmp;
        }
        elements[size++] = planes;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(contains(o)){
            int counter = 0;
            Planes[] tmp = new Planes[0];
            for(int i =0; i<elements.length; i++){
                if(elements[i]==o){
                    size--;
                }
                else{
                   tmp = addNewElement(tmp, elements[i], counter++);
                }
            }
            elements = tmp;
            return  true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        boolean flag = true;
        Iterator<Planes> iterator = (Iterator<Planes>) collection.iterator();
        while (iterator.hasNext()) {
            flag = contains((Planes) iterator.next());
            if (!flag) {
                break;
            }
        }
        return flag;
    }

    @Override
    public boolean addAll(Collection<? extends Planes> collection) {
        for(Planes planes : collection){
            add(planes);
        }
        return true;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Planes> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        for (Object elem : collection){
            remove(elem);
        }

        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        int counter = 0;
        Planes [] array = (Planes[]) collection.toArray();
        Planes[] tmp = new Planes[0];
        for(int j = 0; j<collection.size(); j++){
                if(contains(array[j])){
                    tmp = addNewElement(tmp, array[j], counter++);

        }}
        elements = tmp;
        size = tmp.length;

        return true;
    }

    @Override
    public void clear() {
        size=0;
        elements = new Planes[0];
        initialCapacity = 15;
    }

    @Override
    public Planes get(int i) {
        return elements[i];
    }

    @Override
    public Planes set(int i, Planes planes) {
        return null;
    }

    @Override
    public void add(int i, Planes planes) {
    }

    @Override
    public Planes remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Planes> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Planes> listIterator(int i) {
        return null;
    }

    @Override
    public List<Planes> subList(int i, int i1) {
        return null;
    }
    public  Planes [] addNewElement(Planes[] arr, Planes x, int n){
        int i;
        Planes newarr[] = new Planes[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return  newarr;
    }
}
