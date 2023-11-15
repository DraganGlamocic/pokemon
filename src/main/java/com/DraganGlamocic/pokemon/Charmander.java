package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.attacks.FireSpinAttack;

public class Charmander extends Pokemon {
    public Charmander(String pokemonName) {
        super(pokemonName, new FireSpinAttack());
    }
    public String getAttackName() {
        return "Fire Spin";
    }

    public void attack() {
        String attackMessage = String.format("%s used %s!", getPokemonName(), getAttackName());
        System.out.println(attackMessage);
    }
}