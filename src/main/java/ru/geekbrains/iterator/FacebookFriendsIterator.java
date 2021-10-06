package ru.geekbrains.iterator;

import java.util.List;

public class FacebookFriendsIterator implements Iterator<Friend> {

    private int currentPos;
    private List<Friend> friendList;

    public FacebookFriendsIterator(List<Friend> friendList) {
        this.friendList = friendList;
        currentPos=0;
    }

    public boolean hasNext() {
        return currentPos < friendList.size();
    }

    public Friend getNext() {
        if (!hasNext()) {
            return null;
        }
        Friend friend = friendList.get(currentPos);
        currentPos++;
        return friend;
    }

    public void reset() {
        currentPos = 0;
    }

}
