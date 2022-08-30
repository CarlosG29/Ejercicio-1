/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos Gurdian
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int codigo=0;
        String nombre= " ";
        String apellido= " ";
        double salario= 0;
        int mes=30;
        double salario_dia=0;
        
        System.out.println("Ingrese el codigo del trabajador:");
        codigo = entrada.nextInt();
        System.out.println("Ingrese el nombre del trabajador:");
        nombre= entrada.next();
        System.out.println("Ingrese el Apellido del tranajador:");
        apellido= entrada.next();
        System.out.println("Ingrese el salario mensual:");
        salario= entrada.nextDouble();
        
        salario_dia= salario/mes;
        
        System.out.println("Codigo del Trabajador:"+codigo);
        System.out.println("Nombre del trabajador: "+nombre);
        System.out.println("Apellido del trabajador:"+apellido);
        System.out.println("Salario diario: "+salario_dia);
        
        
        
        
        
    }
    
}
