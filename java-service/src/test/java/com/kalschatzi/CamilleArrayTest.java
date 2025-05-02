package com.kalschatzi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamilleArrayTest {
    private List<String> friends;

    @BeforeEach
    public void setup(){
        System.out.println("Setup in progress...");
        friends = new CamilleArray<>();
        friends.add("John");
        friends.add("Neela");
        friends.add("Michael");
        friends.add("Chenelle");

    }

    @Test
    public void getSizeTest() {
        int size = friends.size();
        assertEquals(4, size);
    }

    @Test
    public void removeElement() {
        String name = friends.remove(2);
        assertEquals("Michael", name);
        System.out.println(" Element removed: " + name);
    }

    @Test
    public void getFirstElement() {
        String firstElement = friends.get(0);
        assertEquals("John", firstElement);
    }

    @Test
    public void searchByIndexTest() {
        ListIterator<String> friendsIterator =
                friends.listIterator(1);

        //String friend = friendsIterator.next();
        // assertEquals("Neela", friend);
    }

    /*@Test
    public void sortList() {
        Collections.sort(friends);

        assertEquals("Chenelle", friends.getFirst());
        assertEquals("Neela", friends.getLast());
    }*/

    @Test
    public void friendName() {
        Friend friendly = new Friend("John");
        assertEquals(friendly.getName(), "John");
        System.out.println();
    }

}