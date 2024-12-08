import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<Object> {
    private List<Object> data = new ArrayList<>();

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<Object> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean add(Object e) {
        return data.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return data.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Object> c) {
        return data.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Object> c) {
        return data.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return data.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return data.retainAll(c);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public Object get(int index) {
        return data.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return data.set(index, element);
    }

    @Override
    public void add(int index, Object element) {
        data.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return data.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return data.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.lastIndexOf(o);
    }

    @Override
    public ListIterator<Object> listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return data.subList(fromIndex, toIndex);
    }
}