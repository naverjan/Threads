
/**
 * Hilo Consumidor
 * @author Grupo Sistemas Operacionales
 * @date 22/06/2021
 */
public class Consume extends Thread {
   
    @Override
    public void run() {
        Sleep(700);
        System.out.println("Hilo Consumidor esta en ejecucion");
        
    }
    
    public void getVacioWhenFalse(Generate gen){
        Sleep(3000);
        while (gen.getValueVacio()) {   
            Sleep(500);
            System.out.println("En espera de tomar la variable");
        }
        System.out.println("Variable a sido tomada desde hilo Consumidor");
    }
    
    private void Sleep(int millis){
        try {
            Consume.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Error al pasar hilo Consumidor a estado bloqueado: "+e.getMessage());
        }
    }
}
