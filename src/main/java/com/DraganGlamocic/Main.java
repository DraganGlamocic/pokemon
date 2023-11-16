package com.DraganGlamocic;

import com.DraganGlamocic.pokemon.Bulbasaur;
import com.DraganGlamocic.pokemon.Charmander;
import com.DraganGlamocic.pokemon.Pokemon;
import com.DraganGlamocic.pokemon.Squirtle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        System.out.println("My name is: ");
        String playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");

        boolean validSelection = false;
        Pokemon chosenPokemon = null;

        while (!validSelection) {

            System.out.println("Please choose a starter pokemon: [Bulbasaur] [Charmander] [Squirtle]");
            System.out.print("Which one would you like: ");
            String chosenPokemonInput = scanner.nextLine();
            chosenPokemonInput = chosenPokemonInput.toLowerCase();

            switch (chosenPokemonInput) {
                case "bulbasaur":
                    System.out.print("Give your Bulbasaur a name: ");
                    String bulbasaurName = scanner.nextLine();
                    chosenPokemon = new Bulbasaur(bulbasaurName);
                    System.out.println("Take good care of " + bulbasaurName + ".");
                    validSelection = true;
                    break;
                case "charmander":
                    System.out.print("Give your Charmander a name: ");
                    String charmanderName = scanner.nextLine();
                    chosenPokemon = new Charmander(charmanderName);
                    validSelection = true;
                    System.out.println("Take good care of " + charmanderName + ".");
                    break;
                case "squirtle":
                    System.out.print("Give your Squirtle a name: ");
                    String squirtleName = scanner.nextLine();
                    chosenPokemon = new Squirtle(squirtleName);
                    validSelection = true;
                    System.out.println("Take good care of " + squirtleName + ".");
                    break;
                default:
                    System.out.println("Hmmm... I don't think we have that pokemon.");
            }
        }

        if (chosenPokemon != null) {
            chosenPokemon.attack();     // How to choose an attack? Learn an attack? choose from array or list?

        }
    }
}