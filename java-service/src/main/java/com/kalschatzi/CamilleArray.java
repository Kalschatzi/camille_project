package com.kalschatzi;

import java.util.*;

public class CamilleArray<T> implements List<T> {

    private Object[] elements = new Object[5];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean add(Object value) {
        // therefore we are adding a value to the "end of the array" (size + 1 or size++)
        elements[size++] = value; // elements[size + 1] = value

         return true;
    }

    @Override//
    public boolean remove(Object o) {
        // Find the index of the object to remove
        int index = searchIndex(o);
        if (index != -1) { // If the object is found
            String name = (String) elements[index];
            elements[index] = ""; // Remove the object at the found index
            return true; // Return true to indicate successful removal
        }
        return false; // Return false if the object was not found
    }



    // takes an object, and returns an index of that object
    private int searchIndex(Object value) { // "Neela"
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    // what the method does ? accepts = ?? returns = ??
    public T remove(int positionToRemove) {
        // creates a new array of objects with the
        Object[] newElements = new Object[elements.length - 1];
        //
        for (int position = 0; position < elements.length - 1; position++) {
           //
            Object name = elements[position];
           //
            if(!name.equals(elements[positionToRemove])) {
                //
                newElements[position] = elements[position];
            } //
        } //
        //
        Object nameRemoved = elements[positionToRemove];
        //
        elements = newElements;
        //
        return (T) nameRemoved; // why is return statement here
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
