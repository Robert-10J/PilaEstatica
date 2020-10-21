package com.Pila;
import javax.swing.*;
import java.util.Stack;
public class Pila {

    Stack pil = new Stack();
    String pila [] = new String[5];

    public void insertar(){
        for (int i = 0; i < pila.length; i++){
            String dato = JOptionPane.showInputDialog(null,
                    "Ingrese al valor");
            pila[i] = dato;
            pil.push(pila[i]);
        }
    }

    public void eliminar(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        } else {
            /*String elem;
            elem = (String) pil.remove(pil.size() - 1);*/
            JOptionPane.showMessageDialog(null, "Se elimino " + pil.remove(pil.size() - 1));
        }
    }

    public void mostrarElementos(){
        String elementos = "";
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "Mo hay datos", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = pila.length - 1; i >=0; i--){
                elementos += pila[i] + "\n";
            }
            JOptionPane.showMessageDialog(null,"Los elementos de la pila son\n" + elementos);
        }
    }

    public void ultimoElemento(){
        /*String pos = (String) pil.peek();
        JOptionPane.showMessageDialog(null, pos);*/
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