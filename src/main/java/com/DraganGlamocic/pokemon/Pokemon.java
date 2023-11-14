package com.DraganGlamocic.pokemon;

import com.DraganGlamocic.interfaces.Attack;

public abstract class Pokemon {

    private Attack attack;

    public Pokemon(Attack attack) {
        this.attack = attack;
    }

    public void attack() {
        attack.attack();
    }
}