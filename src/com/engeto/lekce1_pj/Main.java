package com.engeto.lekce1_pj;

import java.math.BigDecimal;

public class Main {

    //  missing ""
    public static void ukol1() {
        System.out.println("Hello world!");
    }

    public static void ukol2() {
        //  missing ""
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        // string > int
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        //  10,0 > 10.0
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        //  double cena > BigDecimal cena + consequences
        BigDecimal cena = BigDecimal.valueOf(0);
        for (int i = 0; i < 10; i++) {
            //cena += 0.1;
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        //BigDecimal cena = 0;
        BigDecimal cena = BigDecimal.valueOf(0);

        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        //int vykonMotoru = "120";
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: " + vykonMotoru + " kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        //System.out.println("Velikost košile je: ", velikostKosile, ".");
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }

    //    public void ukol9() {
    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}