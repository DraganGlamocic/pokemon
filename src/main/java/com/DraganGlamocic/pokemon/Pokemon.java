package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.interfaces.Attack;

public abstract class Pokemon {
    private String pokemonName;
    private String attackName;
    protected final Attack attack;


    public Pokemon(String pokemonName, Attack attack) {
        this.pokemonName = pokemonName;
        this.attack = attack;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getAttackName() {
        return attackName;
    }

    public void attack() {
        attack.attack();
    }
}