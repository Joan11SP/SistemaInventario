package com.solsoftware.utilidades;

import com.solsoftware.modelos.Persona;
import javax.swing.JOptionPane;

public class Utilidades {

    Persona persona = new Persona();
    

    public void validarDigitosTxt() {
        
        
    }

    public void validarTextoTxt() {
      
    }

    public void ValidarCedula() {
    int suma = 0;  
    int resultado=0;
    int[] cedula = new int[] {1,1,5,0,1,7,1,5,3,4};
        for(int i=0;i<cedula.length-1;i++){
            suma=cedula[i]*2;
            i++;
            suma=cedula[i]*1;
            
        }
           System.out.println(""+resultado); 
    }
    public static void main(String[] args) {
        Utilidades u = new Utilidades();
        u.ValidarCedula();
    }

}
