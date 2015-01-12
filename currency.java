
/**
 * Constructor class for currencies
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class currency{
  private String name; //Currency name
  private double base; //Multiplication base for calculation of value with main currency

    public currency(String nam, int power){
        name = nam + " dollar";
        base = find_base(power);
    }
    
    private double find_base(int power){
        double x;
        
        if(power>100)x=0.3;
        else x=0.1;
        if(power>200)x=0.4;
        if(power>300)x=0.5;
        if(power>400)x=0.6;
        if(power>500)x=0.8;
        if(power>600)x=1.0;
        if(power>700)x=1.1;
        if(power>800)x=1.3;
        if(power>900)x=1.5;
        
        return (0.75+(x*(Math.random()*0.5)));
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double mult){
        this.base = this.base * mult;
    }
    
    public String getName(){
        return this.name;
    }
}
