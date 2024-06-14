
package com.mycompany.pokemon_abstract_interface;


public class Bulbasaur extends Pokemon implements IPlanta{
    protected String message = "";
    public Bulbasaur() {
    }

    
    
    public Bulbasaur(int num_pokedesk, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece, String tipo) {
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
    public String atacarParalizar() {
        message = "Paralizar!";
        return message;
    }

    @Override
    public String atacarDrenaje() {
      message = "DRENAR!";
        return message;
    }

    @Override
    public String atacarHojaAfilada() {
        message = "HOJAS CORTANTES";
        return message;
    }

    @Override
    public String atacarLatigoCepa() {
        message = "LATIGO CEPA";
        return message;
    }

   
    

   
}


