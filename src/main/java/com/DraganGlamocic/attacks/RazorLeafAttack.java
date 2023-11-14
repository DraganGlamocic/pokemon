package com.DraganGlamocic.attacks;

import com.DraganGlamocic.interfaces.Attack;

public class RazorLeafAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Bulbasaur used Razor Leaf!");
    }
}
