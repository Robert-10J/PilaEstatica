package com.Pila;
import javax.swing.*;
import java.util.Stack;
public class Pila {

    Stack pil = new Stack();
    String pila [] = new String[7];

    public void insertar(){
        for (int i = 0; i < pila.length; i++){
            String dato = JOptionPane.showInputDialog(null,
                    "Ingrese al valor");
            pila[i] = dato;
            pil.push(pila[i]);
        }
    }

    public void eliminar(){
        String dato = JOptionPane.showInputDialog(null,"Que dato desea eliminar");
        for (int i = 0; i < pila.length; i++){
            if (pila[i].equals(dato)){
                pil.remove(dato);
            }
        }
    }

    public void mostrarElementos(){
        while(pil.empty() == false){
            JOptionPane.showMessageDialog(null, pil.pop());
        }
    }

    public void ultimoElemento(){
        String pos = (String) pil.peek();
        JOptionPane.showMessageDialog(null, pos);
    }

    public void estadoPila(){
        if (pil== null || pil.empty()){
            JOptionPane.showMessageDialog(null,"Mo hay datos");
        } else {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }
}