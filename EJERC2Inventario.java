package actv1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Objeto> objetos = new ArrayList<>();

    public void agregarObjeto(Objeto obj) {
        objetos.add(obj);
    }

    public void mostrarInventario() {
        System.out.println("Inventario contiene:");
        for (Objeto obj : objetos) {
            System.out.println("- " + obj.getNombre());
        }
    }
}

