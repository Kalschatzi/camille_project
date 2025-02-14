package com.kalschatzi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class FriendArrayListTest {
    private Friend friendObject;
    private ArrayList<String> friends;

    @BeforeEach
    public void setup(){
        friends = new ArrayList<>();
        friendObject = new Friend();
        friends.add("John");
        friends.add("Yanny");
        friends.add("Michael");
        friends.add("Chenelle");
    }

    @Test
    public void getSizeTest() {
        int size = friendObject.getSize(friends);
        System.out.println(size);

    }
    @Test
    public void removeElement() {
        friends.remove(2);
        System.out.println(friends);
    }

    @Test
    public void getFirstElement() {
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

}