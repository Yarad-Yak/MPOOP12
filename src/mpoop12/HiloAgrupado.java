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
public class HiloAgrupado extends Thread{

    public HiloAgrupado(ThreadGroup group, String name) {
        super(group, name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion" + i + "de" + getName());
        }
        System.out.println("Termina el" + getName());
    }
}
