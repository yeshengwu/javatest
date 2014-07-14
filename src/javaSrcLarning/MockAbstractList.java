package javaSrcLarning;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Evan.Ye
 * @date 2013-8-4
 * @version 1.0.0
 * @Description:为了看 extends以及implemets后会重载的方法
 */
public class MockAbstractList<E> extends AbstractCollection<E> implements List<E> {

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub

    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

}
