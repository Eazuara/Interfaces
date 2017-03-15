    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author esteb
 */
public class NobodySpecial extends Human {
    
   public NobodySpecial(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "NoBodySpecial{"+super.toString() + '}';
    }
    
    
}