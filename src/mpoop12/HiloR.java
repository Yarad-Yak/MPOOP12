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
public class HiloR implements Runnable{ //Firmando todo el contrato

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion" + i + "de" + Thread.currentThread().getName());
        }
        System.out.println("Termina el" + Thread.currentThread().getName());
    }
    
}
