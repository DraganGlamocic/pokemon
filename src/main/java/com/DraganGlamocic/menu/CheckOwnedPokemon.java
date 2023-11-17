package com.DraganGlamocic.menu;


import com.DraganGlamocic.arrays.OwnedPokemonList;
import com.DraganGlamocic.pokemon.Pokemon;
import java.util.List;

public class CheckOwnedPokemon {
    public void checkOwnedPokemon(OwnedPokemonList ownedPokemonList) {
        List<Pokemon> ownedPokemon = ownedPokemonList.getOwnedPokemon();
        for (Pokemon pokemon : ownedPokemon) {
            System.out.println(pokemon.getPokemonName());
        }
    }
}