package com.ersen.Bookaholics.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/** Used for deserialization purposes*/
public class BookList {

    @SerializedName("items")
    private ArrayList<Book> mBookItems;

    public ArrayList<Book> getBookItems() {
        return mBookItems;
    }
}
