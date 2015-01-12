
/**
 * Class constructor for the counters of the clock of world game of Enterprizes
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class CyclicCounter{
    private int limit;
    private int counter;
    public CyclicCounter(int lim){
        limit = lim;
        counter = 0;
    }
    
    public void setCounter(int value){
        this.counter=value;
    }
    
    public int getCounter(){
        return this.counter;
    }
    
    public void setLimit(int value){
        this.limit = value;
    }
    
    public int getLimit(){
        return this.limit;
    }
    
    public void increace(){
        this.counter++;
    }
    
    public void reset(){
        this.counter = 0;
    }
}
