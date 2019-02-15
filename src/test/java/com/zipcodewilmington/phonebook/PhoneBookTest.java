package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {
//   private TreeMap<String, String> phoneBook;
//
//   @Before
//   public void phonebookTest() {
//      this.phoneBook = new PhoneBook();
//   }


   @Test
   public void addTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
      String name = "Julian";
      String phoneNumber = "123";
      phoneBook.add(name, phoneNumber);
      String expected = "123";

      // when
      String actual = phoneBook.lookup("Julian");

      // then
      Assert.assertEquals(expected, actual);
   }

   @Test
   public void removeTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
      String name = "Julian";
      String phoneNumber = "123";
      phoneBook.add(name, phoneNumber);

      // when
      phoneBook.remove("Julian");
      String actual = phoneBook.lookup("Julian");

      // then
      Assert.assertNull(actual);
   }

   @Test
   public void lookupTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
      String name = "Julian";
      String expectedPhoneNumber = "123";
      phoneBook.add(name, expectedPhoneNumber);
      phoneBook.lookup(name);

      // when
      String actual = phoneBook.lookup(name);

      // then
      Assert.assertEquals(expectedPhoneNumber, actual);
   }

   @Test
   public void reverseLookupTest() {
      // given
      PhoneBook phoneBook = new PhoneBook();
      String expectedName = "Julian";
      String phoneNumber = "123";
      phoneBook.add(expectedName, phoneNumber);


      // when
      String actualName = phoneBook.reverseLookup(phoneNumber);

      // then
      Assert.assertEquals(expectedName, actualName);

   }

   @Test
   public void displayTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
//      String name = "Julian";
//      String phoneNumber = "123";
//      phoneBook.add(name, phoneNumber);
      phoneBook.add("Zebra", "111-222-333");
      phoneBook.add("Dog", "222-444-4444");
      String expectedOutput = "Dog 222-444-4444\nZebra 111-222-333\n";

      // when
      String actual = phoneBook.display();

      // then
      Assert.assertEquals(expectedOutput, actual);
   }


   @Test
   public void removeRecordTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
      String name = "Julian";
      String phoneNumber = "123";
      phoneBook.add(name, phoneNumber);

      // when
      phoneBook.removeRecord("Julian");
      String actual = phoneBook.lookup("Julian");

      // then
      Assert.assertNull(actual);
   }

   @Test
   public void removeByNumberTest() {
      PhoneBook phoneBook = new PhoneBook();
      String name = "Julian";
      String phoneNumber = "123";
      phoneBook.add(name, phoneNumber);

      // when
      phoneBook.removeByNumber("123");
//      String actual = phoneBook.reverseLookup("123");
      String actual = phoneBook.lookup("Julian");
      System.out.println(actual);
      // then
      Assert.assertNull(actual);
   }

   @Test
   public void addByNumberTest() {
      // given
//      TreeMap<String, String> phoneBook = new TreeMap<String, String>();
      PhoneBook phoneBook = new PhoneBook();
      String phoneNumber = "123";
      phoneBook.addByNumber(phoneNumber);
      String expected = "Default";

      // when
      String actual = phoneBook.reverseLookup("123");

      // then
      Assert.assertEquals(expected, actual);
   }

}
