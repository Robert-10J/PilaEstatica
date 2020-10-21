package com.Pila;
import javax.swing.*;
import java.util.Stack;
public class Pila {

    Stack pil = new Stack();
    String pila [] = new String[5];

    public void insertar() {

            if (pila.length == pil.size()){
                JOptionPane.showMessageDialog(null,"La pila esta llena",
                        "No puede ingresar mas datos", JOptionPane.WARNING_MESSAGE);
            } else if (pila == null ||pil.isEmpty()){
                for (int i = 0; i < pila.length; i++){
                    String dato = JOptionPane.showInputDialog(null,
                            "Ingrese al valor");
                    pila[i] = dato;
                    pil.push(pila[i]); //Transformamos el arreglo en una lista
                }
            } else {
                JOptionPane.showMessageDialog(null,"Pila no esta lista para recibir mas datos",
                        "No puede introducir mas datos", JOptionPane.WARNING_MESSAGE);
            }
    }
    public Object delete(){return pil.remove(pil.size() - 1);}

    public void eliminar(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se elimino " + delete());
        }
    }

    public void mostrarElementos(){
        String elementos = "";
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = pil.size() - 1; i >=0; i--){
                elementos += pil.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null,"Los elementos de la pila son\n" + elementos);
        }
    }

    public void ultimoElemento(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ultimo dato " +  pil.get(pil.size() - 1));
        }
    }

    public void estadoPila(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        }  else {
            JOptionPane.showMessageDialog(null,"La pila posee  " + pil.size() + " elementos");
        }
    }
}