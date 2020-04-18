package com.surbitonix97;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner myScanner = new Scanner(System.in);
    private static Team myTeam = new Team("surbitonix");

    public static void main(String[] args) {
        //myTeam.addU
        //Player newPlayer = Player.createPlayer("John",22);
        myTeam.addUser(Player.createPlayer("John",22));
        myTeam.addUser(Player.createPlayer("Angel",19));

        myTeam.printTeamPlayers();

    }




    }

