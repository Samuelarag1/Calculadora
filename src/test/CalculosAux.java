package test;

import java.util.ArrayList;
import java.util.*;

public class CalculosAux {
    public static void main(String[] args) {
        
        Double suma = 0.0;
        
        ArrayList<Double> numeros = new ArrayList<Double>();
        
       
        numeros.add(2.5);
        numeros.add(2.4);
        numeros.add(2.3);
        numeros.add(2.2);
        numeros.add(2.1);
        
    
    for(int i = 0; i < numeros.size(); i++){
             if(i == 0){
                suma = numeros.get(i);
        }if(i != 0){
            suma -= numeros.get(i);
        }
    }
        System.out.println(suma);
        }
}
