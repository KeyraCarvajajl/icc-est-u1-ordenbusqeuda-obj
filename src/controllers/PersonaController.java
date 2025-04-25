package controllers;
import models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < personas.length; j++) {
                // if (personas[j].getCodigoDireccion() > personas[max].getCodigoDireccion()){
                //     max = j;
                if (personas[j].equalsByCodigoDireccion(personas[max])) {
                    max = j;
                }
            }
            if (max != i) {
                Persona temp = personas[max];
                personas[max] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public Persona findPersonByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length;

        while (bajo <= alto) {
            int centro = (alto + bajo) / 2;
            int valorCentral = personas[centro].getCodigoDrireccion();

            if (valorCentral > codigo) {
                return personas[centro];
            }
        }

        return null;
    }
}
