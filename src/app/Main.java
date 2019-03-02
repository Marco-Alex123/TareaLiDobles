package app;

import Excepciones.isEmptyException;
import Stack.StackSimpleList;
import Stack.Stacks;
import javax.swing.JOptionPane;
import Queue.*;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) throws isEmptyException {
        
   
         
        int resp = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tamaño de la cola #1", null));
      Queue <Integer> queue = new QueueDoubleList <Integer>(resp);
       
        int opc = 0;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("1: ENCOLAR"
                    + "\n 2: SACAR ULTIMO VALOR"
                    + "\n3: OBTENER PRIMER ELEMENTO DE LA COLA"
                    + "\n4: OBTENER ULTIMO ELEMENTO DE LA COLA"
                    + "\n5: IMPRIMIR TODA LA COLA "
                    + "\n 6: VACIAR TODA LA COLA"
                    + "\n7: Salir", null));
            int aux;
            switch (opc) {
                case 1:
                    resp = Integer.parseInt(JOptionPane.showInputDialog("INTRUDUZCA EL ELEMENTO QUE DESEA AGREGAR", null));
                    queue.enqueue(resp);
                  
       

                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println(""+queue.front());
         
                    break;
                case 4:
                    System.out.println(""+queue.last()); 
                    break;

                case 5:
                   Iterator <Integer> iterador =  queue.iterator(); 
                   while(iterador.hasNext()){
                       System.out.println(""+iterador.next());}
                  
                case 6:
                    queue.removeAll();
                    break;

            }
        } while (opc != 7 && opc > 0);
    }

}
