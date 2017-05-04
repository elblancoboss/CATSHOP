package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Collections.*;
/**
 * Write a description of class BetterBasket here.
 * @author  Hussein Mahdi 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
    private static final long serialVersionUID = 1L;
    

    @Override public boolean add(Product pr)
    {
        for(int a = 0; this.size() > a; a++)
        { 
            if(get(a).getProductNum().equals(pr.getProductNum()))
            { 
                get(a).setQuantity(get(a).getQuantity()+pr.getQuantity());
                
                return true; 
            }
        }
        pronumsort(pr);
        
        return false; 
    }

    public void pronumsort(Product pr)
    {
        super.add( pr );
        Collections.sort( this,(f,s) -> f.getProductNum().compareTo( s.getProductNum() ) );
    }
}
