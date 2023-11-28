package com.yagmur;

public class Menu {


    private Corba corba;
    private Icecek icecek;
    private Yemek yemek;
    private Tatli tatli;

    public Menu(Corba corba, Icecek icecek, Yemek yemek, Tatli tatli) {
        this.corba = corba;
        this.icecek = icecek;
        this.yemek = yemek;
        this.tatli = tatli;
    }

    public void yazdir() {
        System.out.println("Corba: " + corba);
        System.out.println("Icecek: " + icecek);
        System.out.println("Yemek: " + yemek);
        System.out.println("Tatli: " + tatli);
        System.out.println();
    }


    enum Corba {
        MERCIMEK, DOMATES, TAVUK;
    }

    enum Icecek {
        SU, COLA, LIMONATA;
    }

    enum Yemek {
        KOFTE, MAKARNA, IZGARA_TAVUK;
    }

    enum Tatli {
        BAKLAVA, KAZANDIBI, SUTLAC;
    }

    enum Gun {
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;
    }

}
