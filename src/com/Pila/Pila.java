package com.Pila;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;
public class Pila {

    Stack pil = new Stack();
    String pila [] = new String[5];
    int element = 0;

    public boolean vacio(){
        return element <= 0;
    }

    public void insertar() {
        for (int i = 0; i < pila.length; i++){
            String dato = JOptionPane.showInputDialog(null,
                    "Ingrese al valor");
            pila[i] = dato;
            pil.push(pila[i]);
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
            //JOptionPane.showMessageDialog(null, "ultimo dato" + pila(inElement - 1));
            JOptionPane.showMessageDialog(null, "Ultimo dato" +  pil.get(pil.size() - 1));
        }
    }

    public void estadoPila(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        }  else {
            JOptionPane.showMessageDialog(null,"Pila llena ");
        }
    }
}