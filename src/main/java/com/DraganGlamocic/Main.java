package com.DraganGlamocic;

import com.DraganGlamocic.pokemon.Bulbasaur;
import com.DraganGlamocic.pokemon.Charmander;
import com.DraganGlamocic.pokemon.Pokemon;
import com.DraganGlamocic.pokemon.Squirtle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validSelection = false;
        Pokemon chosenPokemon = null;

        while (!validSelection) {
            System.out.println("Choose a starter pokemon: [Bulbasaur] [Charmander] [Squirtle]");
            System.out.print("Which one would you like: ");
            String chosenPokemonInput = scanner.nextLine();

            switch (chosenPokemonInput) {
                case "Bulbasaur":
                    System.out.print("Give your Bulbasaur a name: ");
                    String bulbasaurName = scanner.nextLine();
                    chosenPokemon = new Bulbasaur(bulbasaurName);
                    validSelection = true;
                    break;
                case "Charmander":
                    System.out.print("Give your Charmander a name: ");
                    String charmanderName = scanner.nextLine();
                    chosenPokemon = new Charmander(charmanderName);
                    validSelection = true;
                    break;
                case "Squirtle":
                    System.out.print("Give your Squirtle a name: ");
                    String squirtleName = scanner.nextLine();
                    chosenPokemon = new Squirtle(squirtleName);
                    validSelection = true;
                    break;
                default:
                    System.out.println("Invalid pokemon selection. Please try again.");
            }
        }

        if (chosenPokemon != null) {
            chosenPokemon.attack();
        }
    }
}