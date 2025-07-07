package dev.heffa;

import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {

        if (findContact(contact) == -1 &&
          findContact(contact.getName()) == -1) {
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexOld = findContact(oldContact);
        int indexNew = findContact(newContact.getName());
        if (indexOld < 0) {
            return false;
        }
        if (indexNew != -1 && indexNew != indexOld) {
            return false;
        }
        myContacts.set(indexOld, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            return false;
        }
        myContacts.remove(index);

        return true;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index == -1) {
            return null;
        }

        return myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s\n", i + 1,
              myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }


}