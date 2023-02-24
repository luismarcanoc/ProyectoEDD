/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Archivotexto file = new Archivotexto();
        Grafo lectura = file.leer_txt();

        //lineas básicas para iniciar programa
        //inicialización lista
        Lista list = new Lista();

        //inicialización grafo
        Grafo grafo = new Grafo(list);

        //apertura primera GUI
        ImportMenu window = new ImportMenu(grafo);
        window.setVisible(true);

//        System.out.println(lectura.printAdy());
//        lectura.aumentarVerticesInsertar("F", listastock);
//        System.out.println(lectura.printAdy());

//////Prueba actual de BFS DFS
//        System.out.println(lectura.printGrafo());
//        System.out.println("Recorrido BFS");
//        lectura.profundidad();
//        lectura.recorridoBFS();



//        file.escribir_txt(lectura);
//        Arraylist arreglo=new Arraylist(10);
//        arreglo.insertBegin("estas", 1);
//        arreglo.insertBegin("como", 2);
//        arreglo.insertBegin("hola", 3);
//        System.out.println(arreglo.printList());
//        System.out.println(arreglo.getArray()[1].getName());
    }

}
