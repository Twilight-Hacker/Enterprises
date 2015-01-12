
/**
 * Constructor class for Buildings (all appropriate bussinesses must have one)
 * 
 * Vasilis G.M.E. Fragkas
 * 7992 Mathimatiko Iwanninwn
 * v1.00
 */

public class building{
    private StreetNode Location; //Location of the building
    private int level; //Building level, must be equal to or higher than bussiness level
    private int[] protection = new int[4]; //Protection level Array, 0=quake, 1=flood, 2=fire, 3=burglary/bandalism
    
    public building(StreetNode Street, int PID){
        if(Street.getOwner()==PID){
            if(!Street.isMortaged()){
                if(!Street.isUsed()){
                    Location = Street;
                    level = 1;
                    Location.use();
                    protection[0]=1;
                    protection[1]=1;
                    protection[2]=1;
                    protection[3]=1;
                }else System.out.println("This street already has a building");
            }else System.out.println("This street is Mortaged");
        }else System.out.println("This street is not owned by you");
    }
    
    public building(StreetNode Street, int PID, int le, int qu, int fl, int fi, int bu){
        if(Street.getOwner()==PID){
            if(!Street.isMortaged()){
                if(!Street.isUsed()){
                    Location = Street;
                    level = le;
                    Location.use();
                    protection[0]=qu;
                    protection[1]=fl;
                    protection[2]=fi;
                    protection[3]=bu;
                }else System.out.println("This street already has a building");
            }else System.out.println("This street is Mortaged");
        }else System.out.println("This street is not owned by you");
    }
    
    public int getPosition(){
        return this.Location.getPosition();
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public int getQuakeP(){
        return this.protection[0];
    }

    public int getFloodP(){
        return this.protection[1];
    }

    public int getFireP(){
        return this.protection[2];
    }

    public int getBurgP(){
        return this.protection[3];
    }

}
