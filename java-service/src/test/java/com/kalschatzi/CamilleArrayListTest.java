package com.kalschatzi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamilleArrayListTest {
    private List<String> friends;

    @BeforeEach
    public void setup(){
        friends = new CamilleArrayList<>();
       // friendObject = new Friend();
        friends.add("John");
        friends.add("Yanny");
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
        assertEquals("Michael", friends.remove(2));
        System.out.println(friends);
    }

    @Test
    public void getFirstElement() {
        assertEquals("John", friends.get(0));
        System.out.println(friends.get(0));
    }

    @Test
    public void loopOverList() {
        for (String name : friends) {
            System.out.println(name);
        }
    }

    @Test
    public void sortList() {
        Collections.sort(friends);
        System.out.println(friends);
    }

    @Test
    public void friendName() {
        Friend friendly = new Friend("John");
        assertEquals(friendly.getName(), "John");
        System.out.println();
    }

}