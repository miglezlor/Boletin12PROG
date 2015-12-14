package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Garaxe {
    private float prezo;
    private int numCoches, pago;
    private String matricula;
    private int horas;
    String nl = System.getProperty("line.separator");
    
    public void comprobarGaraxe(int numCoches){
        do{
            numCoches=Integer.parseInt(JOptionPane.showInputDialog("Coches aparcados"));
        }while (numCoches<0 | numCoches>5);
        
        if(numCoches==5)
            JOptionPane.showMessageDialog(null, "COMPLETO");
        else
            JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES");
        
    }

    public String pedirMatricula(){
        matricula=JOptionPane.showInputDialog("Introduce a matricula");
        return matricula;
    }
    public float pagoHoras(){
        horas=Integer.parseInt(JOptionPane.showInputDialog("Horas aparcado"));
        if (horas>3)
            prezo=(float) (1.5+((horas-3)*0.2));
        else if (horas==3)
            prezo=(float) 1.5;
        else
            prezo=(float) (0.2*horas);
        
        return prezo;
        
}
    public int pagoEfectuado(){
        pago = Integer.parseInt(JOptionPane.showInputDialog("Introduce o pago en efectivo"));
        return pago;
    }
    public void factura(){
        JOptionPane.showMessageDialog(null, "FACTURA"+nl+"MATRICULA: "+matricula+ nl +"TEMPO: "+horas+" horas"+nl+"PREZO: "+prezo+" €"+nl+"CARTOS RECIBIDOS: "+pago+" €"+nl+"CARTOS DEVOLTOS: "+(pago-prezo)+"€"+nl+"GRAZAS POR USAR O NOSO APARCADOIRO");
    }
}
