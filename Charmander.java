
package com.mycompany.pokemon_abstract_interface;


public class Charmander extends Pokemon implements IFuego{
     
    protected String message = "";

    public Charmander() {
    }

    public Charmander(int num_pokedesk, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece, String tipo) {
        super(num_pokedesk, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    
    @Override
    public String atacarPlacaje() {
        message = "Ataco Placaje!";
        return message;
    }

    @Override
    public String atacarArañazo() {
        message = "Te rasguño!";
        return message;
    }

    @Override
    public String atacarMordisco() {
        message = "Mordisco!";
        return message;
    }

    @Override
    public String atacarPunioFuego() {
        message = "Puño de Fuego!";
        return message;
    }

    @Override
    public String atacarAscuas() {
         message = "Ascuas!";
        return message;
    }

    @Override
    public String atacarLanzallamas() {
         message = "LanzaLLamas!";
        return message;
    }
    
}
