package com.DraganGlamocic.arrays;

import com.DraganGlamocic.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class OwnedPokemonList {

    private List<Pokemon> ownedPokemon;

    public OwnedPokemonList() {
        this.ownedPokemon = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        ownedPokemon.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        ownedPokemon.remove(pokemon);
    }

    public List<Pokemon> getOwnedPokemon() {
        return ownedPokemon;
    }

    public void fight() {
    }

    public void checkOwnedPokemon() {
        List<Pokemon> ownedPokemon = getOwnedPokemon();
        for (Pokemon pokemon : ownedPokemon) {
            System.out.println(pokemon.getPokemonName()); // Print the name of the current Pokémon
        }
    }


}
