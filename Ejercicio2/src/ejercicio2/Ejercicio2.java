/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author ms324
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int Opcion,a;
        EJERCICIO1 objpilaEnteros = new EJERCICIO1();
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATO\n"+
                    "2. QUITAR\n"+
                    "3. CIMA PILA\n"+
                    "4. PILA VACIA\n"+
                    "5. LIMPIAR PILA\n"+
                    "6. MOSTRAR\n"+        
                    "7. SALIR\n"+
                    "--------------------------------------------------------\n"
                   +JOptionPane.QUESTION_MESSAGE));
             

            switch(Opcion)
            {
                case 1: 
                    a=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL NUMERO A AGREGAR"));
                    objpilaEnteros.insertar(a);
                    break;
                case 2: objpilaEnteros.quitar();
                break;
                
                case 3: objpilaEnteros.cimaPila();
                break;
                
                case 4: objpilaEnteros.pilaVacia();
                break;
                
                case 5: objpilaEnteros.limpiarPila();
                break;
                
                case 6: objpilaEnteros.mostrarpila();
                break;
                
                case 7: System.exit(0);
                break;
                
                default: JOptionPane.showMessageDialog(null,"NO ES CORRECTA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }while(true); 
    }
    }
    
    
    

