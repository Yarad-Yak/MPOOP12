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
public class MPOOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        /*
        System.out.println("######################## Thread ########################");
        HiloT hiloT1 = new HiloT("Primer hilo");
        hiloT1.start();
        
        new HiloT("Segundo hilo").start(); //Hace lo mismo que la linea 19 pero no asigno variable
        
        System.out.println("Termina en hilo principal");
        */
        /*
        System.out.println("######################## Runnable ########################");
        new Thread(new HiloR(), "Primer hilo").start(); //Crea un nuevo hilo pasandole el metodo Runnable
        new Thread (new HiloR(), "Segundo Hilo").start();
        System.out.println("Termina el hilo principal");
        */
        /*
        System.out.println("######################## ThreadGroup ########################");
        ThreadGroup grupoHilo = new ThreadGroup("Grupo de Hilo");
        Thread hilo1 = new HiloAgrupado(grupoHilo,"Hilo 1");
        Thread hilo2 = new HiloAgrupado(grupoHilo,"Hilo 2");
        Thread hilo3 = new HiloAgrupado(grupoHilo,"Hilo 3");
        Thread hilo4 = new HiloAgrupado(grupoHilo,"Hilo 4");
        Thread hilo5 = new HiloAgrupado(grupoHilo,"Hilo 5");
        
        System.out.println("Prioridad del grupo = " + grupoHilo.getMaxPriority());
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilo.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Prioridad del grupo = " +grupoHilo.getMaxPriority());
        
        System.out.println("Prioridad del Thread 1 = " + hilo1.getPriority());
        System.out.println("Prioridad del Thread 2 = " + hilo2.getPriority());
        System.out.println("Prioridad del Thread 3 = " + hilo3.getPriority());
        System.out.println("Prioridad del Thread 4 = " + hilo4.getPriority());
        System.out.println("Prioridad del Thread 5 = " + hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
       
        listarHilos(grupoHilo);
    }

    private static void listarHilos(ThreadGroup grupoHilo) {
        System.out.println("Entrando al metodo listarHilos");
        int numHilos;
        Thread[] listaDeHilos;
        
        try{
            numHilos = grupoHilo.activeCount(); //Solo los huilos activos no los que murieron 
            listaDeHilos = new Thread[numHilos];
            grupoHilo.enumerate(listaDeHilos);
            System.out.println("Hilos activos = "+ numHilos);

            for (int i = 0; i < numHilos; i++) {
                System.out.println("Hilos activos en posicion" + i + "=" + listaDeHilos[i].getName());
            }
        }catch(NullPointerException npe){
            System.out.println("Error! Los hilos terminaron antes de tiempo");
        }
        */
    }
}
