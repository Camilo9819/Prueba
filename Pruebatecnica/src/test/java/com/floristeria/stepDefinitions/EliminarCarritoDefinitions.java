package com.floristeria.stepDefinitions;

import com.floristeria.tasks.EliminarCarritoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class EliminarCarritoDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que Camilo agregue un objeto al carrido")
    public void queCamiloAgregueUnObjetoAlCarrido() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("se le de click a un objeto")
    public void seLeDeClickAUnObjeto() {
        theActorInTheSpotlight().attemptsTo(
                EliminarCarritoTask.ElimininarCarrito()

        );
    }
    @Entonces("se pueda eliminar posteriormente")
    public void sePuedaEliminarPosteriormente() {

    }



}
