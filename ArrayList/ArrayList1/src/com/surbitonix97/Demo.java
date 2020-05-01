package com.surbitonix97;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesILived = new LinkedList<String>();
        addInOrder(placesILived,"Guimaraes");
        addInOrder(placesILived,"Famalicao");
        addInOrder(placesILived,"Salamanca");
        addInOrder(placesILived,"Roma");
        addInOrder(placesILived,"Paris");
        addInOrder(placesILived,"Lyon");
        addInOrder(placesILived,"Bordeaux");
        addInOrder(placesILived,"Tours");
        addInOrder(placesILived,"Roma");
        addInOrder(placesILived,"Famalicao");
        addInOrder(placesILived,"Porto");
        addInOrder(placesILived,"Montreaux");
        addInOrder(placesILived,"Crans-Montana");
        addInOrder(placesILived,"Port Chester");
        addInOrder(placesILived,"Greenwich");
        addInOrder(placesILived,"Stamford");
        addInOrder(placesILived,"London");
        addInOrder(placesILived,"Surbiton");
        addInOrder(placesILived,"Kingston");
        addInOrder(placesILived,"London");
        addInOrder(placesILived,"Zurich");

        //printList(placesILived);

        visit(placesILived);

        }
        private static void printList(LinkedList<String> linkedList)
        {
            //another way of iterating
            Iterator<String> i = linkedList.iterator();
            while (i.hasNext())
            {
                System.out.println("now visiting "+i.next());
            }
            System.out.println("*****************");
        }

        private static boolean addInOrder(LinkedList<String> linkedlist, String newCity){
            ListIterator<String> stringIterator = linkedlist.listIterator();

            while (stringIterator.hasNext())
            {
                int comparison = stringIterator.next().compareTo(newCity);
                if (comparison == 0)
                    {
                        //do not add
                        System.out.println("WARN - "+newCity+" already exists..discarding.");
                        return false;
                    }
                else if (comparison > 0)
                    {
                        //new city should appear b4 this one
                        //do note tho that u need to go back to previous record...so u dont skip it
                        stringIterator.previous();
                        stringIterator.add(newCity);
                        System.out.println(newCity+" was added into the list");
                        return true;
                    }
                else if (comparison < 0)
                    {
                        //move to the nxt city
                    }
            }

            stringIterator.add(newCity);
            return true;
        }

        private static void visit(LinkedList cities )
        {
            Scanner userInput = new Scanner(System.in);
            boolean quit = false;
            boolean moveForward = true;
            ListIterator<String> listIterator = cities.listIterator();

            if (cities.isEmpty())
            {
                System.out.println("no cities on the itinerary");

            }else
                {
                    System.out.println("now visiting "+listIterator.next());
                    printMenu();
                }

            while(!quit)
            {
                int action = userInput.nextInt();
                userInput.nextLine();

                switch (action)
                {
                    case 0:
                        System.out.println("vacation is over\nThx for visiting us....");
                        quit = true;
                        break;
                    case 1:
                        if (!moveForward)
                        {
                            if(listIterator.hasNext())
                            {
                                listIterator.next();
                            }
                            moveForward=true;
                        }
                        if (listIterator.hasNext())
                        {
                            System.out.println("now visiting..."+listIterator.next());
                        }else
                            {
                                System.out.println("reached the end of your mission");
                                moveForward = false;
                            }
                        break;

                    case 2:
                        if(moveForward){
                            if(listIterator.hasNext()){
                                listIterator.previous();
                            }
                            moveForward=false;
                        }
                        if (listIterator.hasPrevious())
                        {
                            System.out.println("Now visiting "+ listIterator.previous());
                        } else
                            {
                                System.out.println("We are at the start of the list");
                                moveForward = true;
                            }
                        break;

                    case 3:
                        printMenu();
                        break;


                }
            }
        }

        private static void printMenu()
        {
            System.out.println("Avaialable Actions\npress" +
                                "\n0 - to quit"+
                                "\n1 - Go to Next City"+
                                "\n2 - Go to Previous City"+
                                "\n3 - Help Menu");
        }

}
