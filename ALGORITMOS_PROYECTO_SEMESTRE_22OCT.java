/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmos_proyecto_semestre_22oct;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joelm
 */
public class ALGORITMOS_PROYECTO_SEMESTRE_22OCT {

     public static void main(String[] args) throws IOException {
        
        int opcion_menu;
        opcion_menu = 0;
        
        System.out.println("Bienvenido a Kipy");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("Selecciona una opción, por favor.");
        
        do {
       
        
        Scanner scan_menu = new Scanner(System.in);
        System.out.println("1. Tableros");
        System.out.println("2. Crear Tablero");
        System.out.println("3. Salir");

        
        opcion_menu = scan_menu.nextInt();
        
        //Variable que represente a mi archivo "lista_tableros.txt"
        File lista_tableros = new File("lista_tablero.txt");

        switch (opcion_menu){
            
        
            //Opción 1 debe evaluar si existen tableros o no, ESTATUS:PENDIENTE
            case 1: tableros();
            break;
            case 2: crear_tablero();
                //Escritura de Archivos
                try{
                //Crear escritor de archivos
                FileWriter lista_tablerosfileWriter = new FileWriter(lista_tableros);
                //Crear escritor en buffer
                BufferedWriter lista_tablerosbufferedWriter = new BufferedWriter(lista_tablerosfileWriter);
                //Ingresar datos para nuevo tablero
                Scanner scan_nuevo_tablero = new Scanner(System.in);
                String código_tablero = "";
                String nombre_tablero = "";
                
                System.out.print("Ingrese el código del Tablero: ");
                código_tablero = scan_nuevo_tablero.nextLine();
                System.out.print("Ingrese el nombre del Tablero: ");
                nombre_tablero = scan_nuevo_tablero.nextLine();
                
                String linea_nuevo_tablero = código_tablero + "|" + nombre_tablero;
                lista_tablerosbufferedWriter.write(linea_nuevo_tablero);
                
                System.out.println("¡Su tablero ha sido guardado con Éxito!");
                System.out.println("¿Qué desa hacer ahora?");
                
                
                lista_tablerosbufferedWriter.close();
                }   catch (FileNotFoundException ex) {
                    Logger.getLogger(ALGORITMOS_PROYECTO_SEMESTRE_22OCT.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            break;
            case 3: System.out.println("Vuelva pronto");
            System.exit(0);
            break;
            default:System.out.println("Opción ingresada no es válida."); 
            break;
        }     

      } while(opcion_menu<4);
     }
    
    public static void tableros() throws IOException{
        
        int opcion_tablero;
        opcion_tablero = 0;
        
        System.out.println("Hola, haz seleccionado Tableros");
        System.out.println("Puedes realizar las siguientes acciones: ");
        
        do {

        Scanner scan_tablero = new Scanner(System.in);
        System.out.println("1. Ver Tableros");
        System.out.println("2. Lista de Tareas");
        System.out.println("3. Tareas");
        System.out.println("4. Eliminar Tablero");
        System.out.println("5. Modificar Tableros");
        System.out.println("6. Regresar al menú inicial");
        
        //Ingresar opción por tablero
        opcion_tablero = scan_tablero.nextInt();
        
        File lista_tableros = new File("lista_tablero.txt");
        
        switch (opcion_tablero){   
            case 1:
                //Lectura de Archivos
                
                try {
                    //Crear lector de archivos
                    FileReader lista_tablerosfileReader = new FileReader(lista_tableros);
                    //Crear lector en buffer
                    BufferedReader lista_tablerosbufferedReader = new BufferedReader(lista_tablerosfileReader);
                    //Crear representación de cada línea del archivo por medio de una variable
                    String linea_tablero ="";
                    //Indicar con while hasta donde queremos leer dentro de nuestro txt, hasta que sea nulo
                    //es decir hasta que no haya más que leer.
                    while ((linea_tablero = lista_tablerosbufferedReader.readLine())!=null){
                        System.out.println(linea_tablero);
             
                        String[] datos = linea_tablero.split("\\|");
                        System.out.println("Código Tablero = " + datos[0]);
                        System.out.println("Nombre de Tablero = " + datos[1]);
                    }
                
                    lista_tablerosbufferedReader.close();
                    System.out.println("¿Qué desa hacer ahora?");
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ALGORITMOS_PROYECTO_SEMESTRE_22OCT.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            break;
            case 2:listado_de_tareas();
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            default:System.out.println("Menú Inicial."); 
            break;
        }
        } while(opcion_tablero < 6);
        
    }
    public static void listado_de_tareas() throws IOException{
        
        int opcion_listado_tareas;
        opcion_listado_tareas = 0;
        
        System.out.println("Hola, haz seleccionado Listado de Tareas");
        System.out.println("Puedes realizar las siguientes acciones: ");
        
        do {

        Scanner scan_listado_tareas = new Scanner(System.in);
        System.out.println("1. Ver Listas de Tareas");
        System.out.println("2. Nueva Lista de Tareas");
        System.out.println("3. Eliminar Lista de Tareas");
        System.out.println("4. Regresar al menú inicial");
        
        //Ingresar opción por tablero
        opcion_listado_tareas = scan_listado_tareas.nextInt();
        
        File lista_listado_tareas = new File("lista_listado_tareas.txt");
        
        switch (opcion_listado_tareas){   
            case 1:
                //Lectura de Archivos
                
                try {
                    //Crear lector de archivos
                    FileReader lista_listado_tareasfileReader = new FileReader(lista_listado_tareas);
                    //Crear lector en buffer
                    BufferedReader lista_listado_tareasbufferedReader = new BufferedReader(lista_listado_tareasfileReader);
                    //Crear representación de cada línea del archivo por medio de una variable
                    String linea_lista_tareas ="";
                    //Indicar con while hasta donde queremos leer dentro de nuestro txt, hasta que sea nulo
                    //es decir hasta que no haya más que leer.
                    while ((linea_lista_tareas = lista_listado_tareasbufferedReader.readLine())!=null){
                        System.out.println(linea_lista_tareas);
             
                        String[] datos = linea_lista_tareas.split("\\|");
                        System.out.println("Código Lista de Tareas = " + datos[0]);
                        System.out.println("Nombre de Lista de Tareas = " + datos[1]);
                    }
                
                    lista_listado_tareasbufferedReader.close();
                    System.out.println("¿Qué desa hacer ahora?");
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ALGORITMOS_PROYECTO_SEMESTRE_22OCT.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            break;
            case 2:
                //Escritura de Archivos
                try{
                //Crear escritor de archivos
                FileWriter lista_listado_tareasfileWriter = new FileWriter(lista_listado_tareas);
                //Crear escritor en buffer
                BufferedWriter lista_listado_tareasbufferedWriter = new BufferedWriter(lista_listado_tareasfileWriter);
                //Ingresar datos para nueva Lista de Tareas
                Scanner scan_nuevo_listado_tareas = new Scanner(System.in);
                String código_listado_tareas = "";
                String nombre_listado_tareas = "";
                
                System.out.print("Ingrese el código la Lista de Tareas: ");
                código_listado_tareas = scan_nuevo_listado_tareas.nextLine();
                System.out.print("Ingrese el nombre de la Lista de Tareas: ");
                nombre_listado_tareas = scan_nuevo_listado_tareas.nextLine();
                
                String linea_nuevo_listado_tareas = código_listado_tareas + "|" + nombre_listado_tareas;
                lista_listado_tareasbufferedWriter.write(linea_nuevo_listado_tareas);
                
                System.out.println("¡Su Lista de Tareas ha sido guardada con Éxito!");
                System.out.println("¿Qué desa hacer ahora?");
                
                
                lista_listado_tareasbufferedWriter.close();
                }   catch (FileNotFoundException ex) {
                    Logger.getLogger(ALGORITMOS_PROYECTO_SEMESTRE_22OCT.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case 3:
            break;
            default:System.out.println("Menú Inicial."); 
            break;
        }
        } while(opcion_listado_tareas < 4);
        
    }
    public static void tareas(){
    }
    public static void etiquetas(){
    }
    public static void lista_de_actividades(){
    }
    public static void activiades(){
    }
    public static void salir(){
    }
    public static void mostrar_tableros_existentes(){
        
    }
    public static void crear_tablero(){
        
    }

}
