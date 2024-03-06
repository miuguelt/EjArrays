/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejarrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class EjArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz = new Aprendiz();
            miAprendiz.setId(i);
            System.out.println("Ingrese el nombre del aprendiz");
            miAprendiz.setNombre(teclado.next());
            System.out.println("Ingrese la n1 del aprendiz");
            miAprendiz.setN1(teclado.nextInt());
            System.out.println("Ingrese la n2 del aprendiz");
            miAprendiz.setN2(teclado.nextInt());
            System.out.println("Ingrese la n3 del aprendiz");
            miAprendiz.setN3(teclado.nextInt());
            listaAprendiz.add(miAprendiz);            
        }
        System.out.println("Imprimiendo lo Aprendices agregados a la lista");
        for(Aprendiz var: listaAprendiz){
            float pro = (var.getN1()+var.getN2())/3f;
            System.out.println("El aprendiz: "+var.getNombre()+" tien el promedio "+pro);
        }
    }
    
}
