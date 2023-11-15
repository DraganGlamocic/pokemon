package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.attacks.WaterGunAttack;

public class Squirtle extends Pokemon {
    public Squirtle(String pokemonName) {
        super(pokemonName, new WaterGunAttack());
    }
    public String getAttackName() {
        return "Water Gun";
    }

    @Override
    public void attack() {
        String attackMessage = String.format("%s used %s!", getPokemonName(), getAttackName());
        System.out.println(attackMessage);
    }
}