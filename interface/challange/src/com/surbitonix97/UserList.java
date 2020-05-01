package com.surbitonix97;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList implements ISavable{
    private String userName;
    ArrayList<String> userList;

    public UserList()
    {
        this.userName=userName;
        this.userList= new ArrayList<String>();
    }

    public String getUserName()
    {
        return userName;
    }



    public void addUser(String userName)
    {
        userList.add(userName);
    }

    @Override
    public ArrayList<String> saveStuff() {

        Scanner userInput = new Scanner(System.in);
        boolean quit = false;
        int index = 0;


        while (!quit) {
            helpMenu();
            int choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    String userName = userInput.nextLine();
                    //userInput.nextLine();
                    userList.add(index, userName);
                    index++;
                    break;
                case 2:
                    System.out.println("Exiting....");
                    quit = true;
                    break;
                case 3:
                    System.out.println("HELP MENU");
                    break;
                default:
                    System.out.println("input not recognized");
                    break;

            }

        }

        return userList;

    }

    public ArrayList<String> getUserList(){
        return userList;
    }
    @Override
    public void populateData(ArrayList<String> data) {
        ArrayList<String> finalList = new ArrayList<String>();
        System.out.println("saving data");
        finalList.addAll(data);
        System.out.println("data saved...see ur list below");

        for (int i=0;i<finalList.size();i++)
        {
            System.out.println(finalList.get(i));
        }

    }

    private void helpMenu() {
        System.out.println("Please see ur options below" +
                "\n 1 - enter user name" +
                "\n 2 - exit" +
                "\n Any other number - Help Menu");
    }


}
