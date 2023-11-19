package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.attacks.FireSpinAttack;

public class Charmander extends Pokemon {
    private String attackName;

    @Override
    public String getPokemonKind() {
        return "Charmander";
    }

    public Charmander(String pokemonName) {
        super(pokemonName, new FireSpinAttack());
        this.attackName = attack.attack();
    }

    public String getAttackName() {
        return attackName;
    }

    @Override
    public void attack() {
        String attackMessage = String.format("%s used %s!", getPokemonName(), getAttackName());
        System.out.println(attackMessage);
    }
}