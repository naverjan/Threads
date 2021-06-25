
/**
 * Punto A. Ultima entrega - Manejo de Hilos - Sistemas operacionales
 * @author Grupo Sistemas Operacionales
 * @date 22/06/2021
 */
public class Main {
    public static void main(String[] args) {
        //Inicializacion de Hilos
        Clear limpiar = new Clear();
        Generate generate = new Generate();
        Consume consume = new Consume();
        
        //Ejecucion de Clear
        limpiar.start();
        //Ejecucion de Generate
        generate.start();
        //Ejeucion de Consume
        consume.start();
        consume.getVacioWhenFalse(generate);                        
    }
}
