package com.Pila;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        Pila obj = new Pila();
        int opcion = 0;

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                                + "1. Insertar\n"
                                + "2. Eliminar\n"
                                + "3. Mostrar todos los elementos\n"
                                + "4. Consultar ultimo dato de la pila\n"
                                + "5. Indica estado de la pila\n"
                                + "6. Salir"));

                switch (opcion){
                    case 1:
                        obj.insertar();
                        break;
                    case 2:
                        obj.eliminar();
                        break;
                    case 3:
                        obj.mostrarElementos();
                        break;
                    case 4:
                        obj.ultimoElemento();
                        break;
                    case 5:
                        obj.estadoPila();
                        break;
                    case 6:
                        opcion = 6;
                        break;
                    default: JOptionPane.showMessageDialog(null,
                            "Vuelva a ingresar nuevamente", "Opcion Invalida", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e){ }
        } while(opcion != 6);
    }
}