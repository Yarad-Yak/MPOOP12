/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop12;

/**
 *
 * @author Yarad Yamil
 */
public class HiloT extends Thread {

    public HiloT(String name) { //Creando constructor Hilo
        super(name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) { //Crear dos hilos que compiten entre si para ver quien tiene la prioridad
            System.out.println("Iteracion" + i + "de" + getName());
        }
        System.out.println("Termina el" + getName());
    }
}
