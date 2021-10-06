package ru.geekbrains.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Friend> friendList = new ArrayList<Friend>();
        friendList.add(new Friend("Ivan"));
        friendList.add(new Friend("Bob"));
        friendList.add(new Friend("Molly"));
        FacebookFriendsIterator facebookFriendsIterator = new FacebookFriendsIterator(friendList);
        while (facebookFriendsIterator.hasNext()){
            System.out.println(facebookFriendsIterator.getNext().getName());
        }
    }



}
