package com.zipcodewilmington.phonebook;

import apple.laf.JRSUIUtils;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private TreeMap<String, String> phoneBook;
//    private String name;
//    private String phoneNumber;

    public PhoneBook() {
        this.phoneBook = new TreeMap<String, String>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void addByNumber(String number) {
        String name = "Default";
        add(name, number);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public void removeByNumber(String number) {
        String name = reverseLookup(number);

        if(!(name.equals(null))) {
            remove(name);
        } else {
            System.out.println("Error");
        }

    }


    public void removeRecord(String name) {
        remove(name);
    }


    public String lookup(String name) {
        String number = phoneBook.get(name);
        return number;
    }

    public String reverseLookup(String phoneNumber) {
        String name = "";
        for (String searchingName : phoneBook.keySet()) {

            String number = phoneBook.get(searchingName);
            if(number.equals(phoneNumber)) {
                     name = searchingName;
                } else {
                name = null;
            }
        }
        return name;
    }

    public String display() {
        String entry = "";
        for (String name: phoneBook.keySet()) {
            // search for the value
            String number = phoneBook.get(name);
            entry += String.format("%s %s\n", name,number);
        }
        return entry;
    }

}
