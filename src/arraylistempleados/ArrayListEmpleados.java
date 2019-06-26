/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistempleados;

/**
 *
 * @author cymaniatico
 */

import java.util.*;
public class ArrayListEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombres=new ArrayList();
        ArrayList<Integer> salarioDia = new ArrayList();
        ArrayList<Integer> dia = new ArrayList();
        ArrayList<Integer> total = new ArrayList();
        boolean continuar = true;
        int decision =1;
        for(int i=0; continuar; i++){
            System.out.println("Ingrese el nombre del empleado");
            nombres.add(leer.next());
            System.out.println("Ingrese el saladio del dia");
            salarioDia.add(leer.nextInt());
            System.out.println("Ingrese los dias trabahados");
            dia.add(leer.nextInt());
            total.add((salarioDia.get(i)*dia.get(i)));
            System.out.println("Desea continuar? (0 para salir)");
            decision = leer.nextInt();
            if(decision==0){
                continuar = false;
            }
        }
        
        for(int i=0; i<total.size();i++){
            System.out.println(nombres.get(i)+"\t"+salarioDia.get(i)+"\t"+dia.get(i)+"\t"+total.get(i));
        }
        
    }
    
}
