package com.base;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nbLancer = 5;
        int ntcase = 0;

        do {

            int reste = 20;
            ntcase = 0;

            for (int i = 1; i <= nbLancer; i++) {

                Random generateur = new Random();

                int lancer = generateur.nextInt(6) + 1;

                reste = reste - lancer;

                ntcase = ntcase + lancer;

                System.out.println("Lancer " + i + " , vous avez fait " + lancer + ". Vous étes sur la case "
                        + ntcase + ". ( encore " + reste + " case)");

                scanner.nextLine();

            }

            if (reste == 0)
                System.out.println("Vous avez gagner");
            else
                System.out.println("Vous avez perdu");

        } while (ntcase != 20);

    }

}
