package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin12_1 {

    public static void main(String[] args) {
        
        int numCoches=0;
        Garaxe obx = new Garaxe();
        obx.comprobarGaraxe(numCoches);
        obx.pedirMatricula();
        obx.pagoHoras();
        obx.pagoEfectuado();
        obx.factura();
        
    }
    
}
