package deber3;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class main {

   
    public static void main(String[] args) {
        
      

 Factura f= new Factura("ordenador",1200);
 Factura f2= new Factura("movil",300);
 Factura f3= new Factura("impresora",200);
 Factura f4= new Factura("imac",1500);
 List<Factura> lista= new ArrayList<Factura>();
 lista.add(f);
 lista.add(f2);
 lista.add(f3);
 lista.add(f4);
 Predicate<Factura> predicado= new Predicate<Factura>() {
 @Override
 public boolean test(Factura f) {
 System.out.println(" iteracion ");
 return f.getId()<300;
 }
 };
 Factura facturaFiltro=
 lista.stream()
 .filter(predicado).findFirst().get();
 System.out.println("UNICA :"+facturaFiltro.getId());
 }

  
        

    }
    

