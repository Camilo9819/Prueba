package com.floristeria.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarCarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

        );
    }

    public static Performable ElimininarCarrito(){
        return instrumented(EliminarCarritoTask.class);
    }
}
