package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.attacks.WaterGunAttack;
import com.DraganGlamocic.interfaces.Attack;

public class Squirtle extends Pokemon {
    private String attackName;

    @Override
    public String getPokemonKind() {
        return "Squirtle";
    }

    public Squirtle(String pokemonName) {
        super(pokemonName, new WaterGunAttack());
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