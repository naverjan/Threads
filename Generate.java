
/**
 * Hilo Generador
 * @author Grupo Sistemas Operacionales
 * @date 22/06/2021
 */
public class Generate extends Thread {

    boolean vacio;

    @Override
    public void run() {
        setValueVacio(true);
        Sleep(500);
        System.out.println("Hilo Generador en ejecucion");
        Sleep(5000);
        setValueVacio(false);
        System.out.println("Variable Vacio pasada a True desde hilo Generador");

    }

    public boolean getValueVacio() {
        return this.vacio;
    }

    public void setValueVacio(boolean vacio) {
        this.vacio = vacio;
    }

    private void Sleep(int millis) {
        try {
            Generate.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Error al pasar el hilo Generate a estado bloqueado");
        }
    }

}
