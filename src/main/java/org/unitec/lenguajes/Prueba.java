
package org.unitec.lenguajes;

/*Segunda forma de crear Threads*/
public class Prueba implements Runnable{
    
    
    public static void main(String[] args) {
        
        System.out.println("Probando Git Hub Ahoraa ...  ");
        Runnable r=new Prueba();
        Thread t1=new Thread(r);
        t1.setName("Juan");
        Thread t2=new Thread(r);
        t2.setName("Ana");
      //  t1.start();
      //  t2.start();
      
      //Tercera manera de crear Threads que viene en el examen.
      //Usando clases anonimas.
      
      Thread t3=new Thread(new Runnable(){
            @Override
            public void run() {
              
      System.out.println("Soy un background Thread..."); 
                
            }
      });
      t3.start();
      
        
    }

    @Override
    public void run() {
        /*
        
         System.out.println("Soy un Thread...y me llamo "+ Thread.currentThread().getName());
         
        if((Thread.currentThread().getName()).equals("Ana")){
            System.out.println("Soy mujer...");
            
        }else{
        System.out.println("Soy hombre...");
    }
        
        
       
        
      */  
        
    }
    
    
    
    
}
