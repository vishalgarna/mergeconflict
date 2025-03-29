package collectionsFrameework;

import java.util.Iterator;
import java.util.Vector;

public class arrayList {


    public static void main(String[] args) {
        
       Vector<Integer> counter = new Vector<>();

       Integer value = 0;

        Thread worker1 = new Thread(()->{
            for(Integer i=0; i<10000; i++){
                System.out.println(i);
                System.out.println("adding "+ Thread.currentThread().getName());   
                counter.add(0, value+i);
            }
        
       
        }, "Thread1");

        System.out.println("hello this side");

        Thread worker2 = new Thread(()->{
            for(Integer i=0; i<10000; i++){
                    System.out.println("adding "+ Thread.currentThread().getName());    
                counter.add(0,value +i);
            }
       
        }, "Thread2");

        worker1.start();
        worker2.start();

        try {
        worker1.join();
        worker2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    
        
        System.out.println(counter.get(0));
    
    }
    
    
}

class counter <T>{

    private Vector<T>add = new Vector<>();

    counter(){
        this.add.add(0, null);
    }
  
         

    public void  addValues(T values){
      
       ;
    }

    public void getValues(){

        Iterator<T> it = this.add.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
        
       
    }


}