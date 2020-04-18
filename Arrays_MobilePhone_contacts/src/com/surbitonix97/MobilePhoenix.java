package com.surbitonix97;

import java.util.ArrayList;

public class MobilePhoenix {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhoenix(String myNumber)
    {
        this.myNumber=myNumber;
        this.myContacts= new ArrayList<Contacts>();

    }

    public boolean addNewContact(Contacts contacts)
    {
        if (findContact(contacts.getName())>=0)
        {
            System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }


    public boolean updateContact(Contacts oldContact, Contacts newContact)
    {
        int foundPosition = findContact(oldContact);
        if (foundPosition<=0)
        {
            System.out.println(oldContact+ " not found");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact+ " was replaced by "+newContact);
        return true;
    }

    public boolean removeContact(Contacts contacts)
    {
        int position = findContact(contacts);
        if (position<0)
        {
            System.out.println(contacts+" was not found");
        }
        this.myContacts.remove(position);
        System.out.println("removed "+contacts+" from your contacts list");
        return true;
    }

    private int findContact(Contacts contacts)
    {
        return this.myContacts.indexOf(contacts);
    }

    private int findContact(String contactName)
    {
        for (int i = 0; i< this.myContacts.size();i++)
        {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName))
            {
                return i;
            }
        }
        return -1;
    }

    public String contactLookup(Contacts contacts)
    {
        if (findContact(contacts)>=0)
        {
            return contacts.getName();
        }
        return null;
    }

    public void printContacts()
    {
        System.out.println("Contact list");
        for (int i = 0; i<this.myContacts.size();i++)
        {
            System.out.println(i+". "+this.myContacts.get(i).getName() +
                    "->" + this.myContacts.get(i).getPhoneNumber() );
        }
    }


}
