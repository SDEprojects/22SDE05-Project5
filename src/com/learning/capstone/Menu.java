package com.learning.capstone;
import org.json.simple.JSONObject;

import java.util.*;

public class Menu {


   // private ArrayList<Item> currentItems = new ArrayList<>();
    private ArrayList<String> missionNames = new ArrayList<>();

    public void addMissionNames() {
        this.missionNames.add("Alien Outpost");
    }

    //public void addCurrentItems() {
       // this.currentItems.add(); JSONObject?
    //}

    public ArrayList<String> getMissionNames() {
        return missionNames;
    }
    public void setMissionNames(ArrayList<String> missionNames) {
        this.missionNames = missionNames;
    }


    public static void mainMenu() {
        System.out.println("              |   Stuck in Outer Space   |                 ");
        System.out.println("              |     Make a Selection:    |                 ");
        System.out.println("------------------------------------------------------------");
        System.out.println("|     1. Inventory          |--------|     2. Missions     |");
        System.out.println("|     3. Help               |--------|     4. Quit         |");
    }

    public void inventoryMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("             |          Inventory:         |                ");
    }

    public void missionsMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("              |          Missions:         |                ");
        System.out.println("------------------------------------------------------------");
        System.out.println("             |         1.Alien Outpost      |                ");

    }

    public void helpMenu() {
        System.out.println("--------------------------------------------------------");
        System.out.println("              |          Help:         |                ");
        System.out.println("     Some useful tips about game play will go here      ");
    }





}


