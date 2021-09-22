package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to NARUTO NINJA WORLD XXL");
            int choose = menu();

            if (choose == 1) {
                Character naruto = new Naruto();
                naruto.display();
                naruto.performJutsu();
                naruto.performElement();

                train(naruto);
                learnElement(naruto);
                break;
            }
            else if (choose == 2) {
                Character sakura = new Sakura();
                sakura.display();
                sakura.performJutsu();
                sakura.performElement();

                train(sakura);
                learnElement(sakura);
                break;
            }
            else if (choose == 3) {
                Character sasuke = new Sasuke();
                sasuke.display();
                sasuke.performJutsu();
                sasuke.performElement();

                train(sasuke);
                learnElement(sasuke);
                break;
            }
            else if (choose == 4) {
                Character kakakshi = new Kakashi();
                kakakshi.display();
                kakakshi.performJutsu();
                kakakshi.performElement();

                kakakshi.setJutsu(new Sharingan()); //Obito gave him the Sharingan
                System.out.print("Thank you Obito!4 "); kakakshi.performJutsu();
                train(kakakshi);
                learnElement(kakakshi);
                break;
            }
            else if (choose == 5) {
                System.out.println("GOODBYE!");
                break;
            }
            else {
                System.out.println("ERROR");
            }
        }
    }

    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("\n Choose the character:");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sakura chan");
        System.out.println("3. Uchiha Sasuke");
        System.out.println("4. Kakashi sensei");
        System.out.println("5. Quit the game");

        selection = input.nextInt();
        return selection;
    }

    public static void train(Character hero) {
        System.out.println("\n Do you want train your character?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        if (select == 1) {
            System.out.println("What kind of jutsu do you want to learn?");
            System.out.println("1. Genjutsu");
            System.out.println("2. Healing");
            System.out.println("3. Taijutsu");
            int selectJutsu = input.nextInt();
            if (selectJutsu == 1)
                hero.setJutsu(new Genjutsu());
            if (selectJutsu == 2)
                hero.setJutsu(new HealingJutsu());
            if (selectJutsu == 3)
                hero.setJutsu(new TaiJutsu());
            System.out.print("You learned new JUTSU!"); hero.performJutsu();
        } else {
            System.out.println("okay, you may train at any time!");
        }
    }

    public static void learnElement(Character hero) {
        System.out.println("\n Do you want learn a new element?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        if (select == 1) {
            System.out.println("What kind of element do you want to learn?");
            System.out.println("1. Water");
            System.out.println("2. Fire");
            System.out.println("3. Wind");
            System.out.println("4. Earth");
            System.out.println("5. Lightning");
            int selectElement = input.nextInt();
            if (selectElement == 1)
                hero.setChakra(new WaterElement());
            if (selectElement == 2)
                hero.setChakra(new FireElement());
            if (selectElement == 3)
                hero.setChakra(new WindElement());
            if (selectElement == 4)
                hero.setChakra(new EarthElement());
            if (selectElement == 5)
                hero.setChakra(new LightningElement());
            System.out.print("You learned a: "); hero.performElement();
        } else {
            System.out.println("Okay, at another time!");
        }
    }
}
