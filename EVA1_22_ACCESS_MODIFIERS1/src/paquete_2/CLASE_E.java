/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_2;

/**
 *
 * @author hp
 */
public class CLASE_E {
  public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
  
        
//        invisible porque es defalult y esta en otra clase
        CLASE_B objB=new CLASE_B();
//        objB.defaultB
        

        
    }

    private static class CLASE_B {

        public CLASE_B() {
        }
    }
}

class CLASE_F {
    public int publicF;
    int defaultF;
    private int privateF;
}
