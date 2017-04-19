/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.a12;

import javax.swing.JOptionPane;

/**
 *
 * @author Aldape
 */
public class SPP2AAldapeFA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double e, p, imc;
        e= pedirDato("Introduce tu estatura");
        p=pedirDato("Introduce tu peso");
        imc= p/Math.pow(e,2);
        if (imc>25){
            JOptionPane.showMessageDialog(null,"Su IMC es "+imc+", usted tiene sobrepeso");
        }
        if (imc<19){
            JOptionPane.showMessageDialog(null, "Su IMC es "+ imc+", usted tiene desnutrición");
        }
        else{
            JOptionPane.showMessageDialog(null,"Su IMC es normal");
        }
    }
    
    public static double pedirDato (String mensaje){
        boolean flag; 
        double dato=0;
        do{
            String usuario= JOptionPane.showInputDialog(null, mensaje);
          try{
            dato= Double.parseDouble(usuario);
            flag=false;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
            flag=true;
        }
    } while (flag);
        return dato;    
}
}
