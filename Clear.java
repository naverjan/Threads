/**
 * Hilo Limpiar
 * @author Grupo Sistemas Operacionales
 * @date 22/06/2021
 */
public class Clear extends Thread {       
        
    @Override
    public void run(){
        System.out.println("Hilo Limpiar en ejecucion");
    }            
    
    private void Sleep(int millis){
        try {
            Consume.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Error al pasar hilo Consumidor a estado bloqueado: "+e.getMessage());
        }
    }
}
