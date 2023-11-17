package com.DraganGlamocic;

import com.DraganGlamocic.arrays.OwnedPokemonList;
import com.DraganGlamocic.menu.CheckOwnedPokemon;
import com.DraganGlamocic.menu.Fight;
import com.DraganGlamocic.pokemon.Bulbasaur;
import com.DraganGlamocic.pokemon.Charmander;
import com.DraganGlamocic.pokemon.Pokemon;
import com.DraganGlamocic.pokemon.Squirtle;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OwnedPokemonList ownedPokemonList = new OwnedPokemonList();
        List<Pokemon> ownedPokemon = ownedPokemonList.getOwnedPokemon();
        Fight fight = new Fight();
        CheckOwnedPokemon checkOwnedPokemon = new CheckOwnedPokemon();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, what is your name?");
        System.out.println("My name is: ");
        String playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");

        boolean validSelection = false;
        Pokemon chosenPokemon = null;

        while (!validSelection) {

            System.out.println("Please choose a starter Pokemon: [Bulbasaur] [Charmander] [Squirtle]");
            System.out.print("Which one would you like: ");
            String chosenPokemonInput = scanner.nextLine();
            chosenPokemonInput = chosenPokemonInput.toLowerCase();

            switch (chosenPokemonInput) {
                case "bulbasaur":
                    System.out.print("Give your Bulbasaur a name: ");
                    String bulbasaurName = scanner.nextLine();
                    chosenPokemon = new Bulbasaur(bulbasaurName);
                    ownedPokemonList.addPokemon(chosenPokemon);
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
                    System.out.println("Hmmm... I don't think we have that Pokemon.");
            }
        }

        boolean gameFinished = false;
        while (!gameFinished) {
            System.out.println("What would you like to do?");
            System.out.println("Fight[1] / Check owned Pokemon[2]:");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    fight.fight(ownedPokemonList); // not working
                    break;
                case "2":
                    System.out.println("Number of owned Pokémon: " + ownedPokemonList.getOwnedPokemon().size()); // Added debugging statement

                    checkOwnedPokemon.checkOwnedPokemon(ownedPokemonList); // not working
                    break;
                default:
                    System.out.println("Type a number...");
            }
        }
    }
}
