package mipaint;

import java.util.LinkedList;

/**
 *
 * @author ALITO
 */
public class Puntos {
    //Declaro dos listas que guardaran la posicion de X y Y del mouse
    LinkedList<Integer> PuntosX = new LinkedList();
    LinkedList<Integer> PuntosY = new LinkedList();
//Metodo que guarda cada uno de los puntos en x y Y
    public void GuardarPuntos(int x, int y) {
        PuntosX.add(x);
        PuntosY.add(y);

    }
    public LinkedList<Integer> ListaX() {
        return PuntosX;
    }

    public LinkedList<Integer> ListaY() {
        return PuntosY;
    }
    public void Borrar(){
        while(!PuntosX.isEmpty()){
            PuntosX.remove();
            PuntosY.remove();
        }
    }
}
