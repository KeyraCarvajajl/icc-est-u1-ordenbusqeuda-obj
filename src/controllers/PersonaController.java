package controllers;
import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        for (int i = 0; i < personas.length; i++){
            int indx = i;

            for (int j = i + 1; j < personas.length; j++){
                if (personas[j].getCodigoDrireccion() < personas[indx].getCodigoDrireccion()){
                    indx = j;
                }
            }

            if (indx != i){
                Persona temp = personas[indx];
                personas[indx] = personas[i];
                personas[i] = temp; 
            }
        }
    }
}
