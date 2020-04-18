package com.surbitonix97;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> contactList = new ArrayList<String>();
    private ArrayList<String> phoneList = new ArrayList<String>();

    public ArrayList<String> getContactList()
    {
        return contactList;
    }

    public void publishContactList()
    {
        System.out.println("You have "+ contactList.size() + " contacts");
        for (int x = 0; x < contactList.size(); x++)
        {
            System.out.println((x+1)+". "+contactList.get(x));
        }
    }

    public void createContact(String contactName)
    {
        contactList.add(contactName);
    }

    public void modifyContact(String currentName, String newName)
    {
        int position = findContact(currentName);
        if (position >= 0)
        {
            System.out.println("Replacing "+ currentName + " by " + newName);
            contactList.set(position,newName);
        }else
            {
                System.out.println(currentName + " not found...no contact will be replaced.");
            }

    }

    public void removeContact(String contactName)
    {
        //contactList.remove(findContact(contactName));
        int position = findContact(contactName);
        if (position>=0)
        {
            contactList.remove(position);
        }else
            {
                System.out.println("contact not found ... ");
            }
    }

    public void findContactInList(String contactName)
    {
        if (findContact(contactName) >= 0 )
        {
            System.out.println(contactName + " exists");
        }else
            {
                System.out.println(contactName + " does not exist");
            }

    }

    private int findContact(String Item)
    {
        return contactList.indexOf(Item);
    }


}
