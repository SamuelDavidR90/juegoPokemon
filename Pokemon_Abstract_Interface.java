
package com.mycompany.pokemon_abstract_interface;


public class Pokemon_Abstract_Interface {

    public static void main(String[] args) {
        System.out.println("im Bulbasaur");
       Bulbasaur bulbasaur = new Bulbasaur();
        System.out.println("Ataque: " + bulbasaur.atacarPlacaje());
        System.out.println("Ataque: " + bulbasaur.atacarMordisco());
        System.out.println("Ataque: " + bulbasaur.atacarArañazo());
        System.out.println("Ataque: " + bulbasaur.atacarDrenaje());
        System.out.println("Ataque: " + bulbasaur.atacarParalizar());
        System.out.println("Ataque: " + bulbasaur.atacarLatigoCepa());
        
        System.out.println("----------------");
        
        System.out.println("im Charmander");
        Charmander charmander = new Charmander();
        System.out.println("Ataque: " + charmander.atacarPlacaje());
        System.out.println("Ataque: " + charmander.atacarMordisco());
        System.out.println("Ataque: " + charmander.atacarArañazo());
        System.out.println("Ataque: " + charmander.atacarAscuas());
        System.out.println("Ataque: " + charmander.atacarLanzallamas());
        System.out.println("Ataque: " + charmander.atacarPunioFuego());
        
        System.out.println("----------------");
        
        
        System.out.println("im Squirtle");
        Squirtle squirtle = new Squirtle();
        System.out.println("Ataque: " + squirtle.atacarPlacaje());
        System.out.println("Ataque: " + squirtle.atacarMordisco());
        System.out.println("Ataque: " + squirtle.atacarArañazo());
        System.out.println("Ataque: " + squirtle.atacarHidrobomba());
        System.out.println("Ataque: " + squirtle.atacarHidropulso());
        System.out.println("Ataque: " + squirtle.atacarPistolaAgua());
        
        
       
    }
}
