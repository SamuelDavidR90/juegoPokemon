
package com.mycompany.pokemon_abstract_interface;


public class Squirtle extends Pokemon implements IAgua{
    
    protected String message;

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
    public String atacarHidrobomba() {
        message = "Hidrobombazo!";
        return message;
    }

    @Override
    public String atacarPistolaAgua() {
        message = "Disparo de agua !";
        return message;
    }

    @Override
    public String atacarBurbuja() {
        message = "Burbuja";
        return message;
    }

    @Override
    public String atacarHidropulso() {
       message = "Hidropulsoo!";
        return message;
    }
    
}
