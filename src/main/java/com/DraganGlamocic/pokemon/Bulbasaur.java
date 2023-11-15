package com.DraganGlamocic.pokemon; // Imports the package 'com.DraganGlamocic.pokemon'

import com.DraganGlamocic.attacks.RazorLeafAttack; // Imports the class 'RazorLeafAttack' from the package 'com.DraganGlamocic.attacks'

public class Bulbasaur extends Pokemon { // Defines a class named 'Bulbasaur' that extends the class 'Pokemon'
    private String attackName; // Declares a private field named 'attackName' of type 'String'


    public Bulbasaur(String pokemonName) { // Defines a constructor for the 'Bulbasaur' class that takes a parameter of type 'String' named 'pokemonName'
        super(pokemonName, new RazorLeafAttack()); // Calls the superclass constructor, passing the 'pokemonName' parameter and a new instance of the 'RazorLeafAttack' class
        this.attackName = attack.attack(); // Assigns the parsed attack name from the 'RazorLeafAttack' object to the 'attackName' field
    }

    @Override // Indicates that this method overrides the method with the same name in the superclass
    public String getAttackName() { // Defines a method named 'getAttackName' that returns a 'String' value
        return attackName; // Returns the parsed attack name stored in the 'attackName' field
    }

    @Override // Indicates that this method overrides the method with the same name in the superclass
    public void attack() { // Defines a method named 'attack' that does not return a value
        String attackMessage = String.format("%s used %s!", getPokemonName(), getAttackName()); // Creates a formatted string message using the 'pokemonName' and 'attackName' values
        System.out.println(attackMessage); // Prints the formatted attack message to the console
    }
}