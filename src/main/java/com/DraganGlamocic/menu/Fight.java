package com.DraganGlamocic.menu;

import com.DraganGlamocic.arrays.OwnedPokemonList;
import com.DraganGlamocic.pokemon.Pokemon;

public class Fight {
    public void fight(OwnedPokemonList ownedPokemonList) {
        // Choose a Pokemon from ownedPokemonList and call its attack method
        Pokemon chosenPokemon = ownedPokemonList.getOwnedPokemon().get(0); // For now, the first pokemon is the chosen one
        chosenPokemon.attack();
    }
}