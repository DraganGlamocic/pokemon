package com.DraganGlamocic;

import com.DraganGlamocic.pokemon.Bulbasaur;
import com.DraganGlamocic.pokemon.Charmander;
import com.DraganGlamocic.pokemon.Pokemon;
import com.DraganGlamocic.pokemon.Squirtle;

public class Main {
    public static void main(String[] args) {
        Pokemon bulbasaur = new Bulbasaur();
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();

        bulbasaur.attack();
        charmander.attack();
        squirtle.attack();

    }
}