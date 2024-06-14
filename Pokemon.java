
package com.mycompany.pokemon_abstract_interface;


public abstract class Pokemon {
    protected int num_pokedesk;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected String temporadaQueAparece;
    protected String tipo;
    
    public Pokemon(){
        
    }
    
    public Pokemon(int num_pokedesk, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece, String tipo){
        this.num_pokedesk = num_pokedesk;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }
    
    public abstract String atacarPlacaje();

    public abstract String atacarArañazo();

    public abstract String atacarMordisco();
        
    
    
}   

