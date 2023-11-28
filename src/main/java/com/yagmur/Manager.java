package com.yagmur;

import java.util.Random;

public class Manager {



    public static Menu gunlukMenuOlustur() {
        Random random = new Random();
        Menu.Corba corba = Menu.Corba.values()[random.nextInt(Menu.Corba.values().length)];
        Menu.Icecek icecek = Menu.Icecek.values()[random.nextInt(Menu.Icecek.values().length)];
        Menu.Yemek yemek = Menu.Yemek.values()[random.nextInt(Menu.Yemek.values().length)];
        Menu.Tatli tatli = Menu.Tatli.values()[random.nextInt(Menu.Tatli.values().length)];

        return new Menu(corba, icecek, yemek, tatli);
    }

    public static void haftalikMenuYazdir() {
        for (Menu.Gun gun : Menu.Gun.values()) {
            Menu gunlukMenu = gunlukMenuOlustur();
            System.out.println(gun + " Gunu:");
            gunlukMenu.yazdir();
        }
    }


}
