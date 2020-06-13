package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    /**
     * Data Members
     */
    private String mOwner;
    private boolean mPool;
    /**
     * Constructors
     */
    public House(int lenght, int width, int lotLength, int lotWidth){
        super(lenght, width, lotLength, lotWidth);
    }
    public House(int lenght, int width, int lotLength, int lotWidth, String owner){
        super(lenght, width, lotLength, lotWidth);
        mOwner = owner;
    }
    public House(int lenght, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(lenght, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = pool;
    }
    /**
     * Getters
     */
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    /**
     * Mutators
     */
    public void setOwner(String owner){
        mOwner = owner;
    }
    public void setPool(boolean pool){
        mPool = pool;
    }
    /**
     * Converting info of the object to String object
     */
    @Override
    public String toString(){
        String s = "";
        if(mOwner != null){
            s += "Owner: " + mOwner;
        }
        else{
            s += "Owner: n/a";
        }
        if(mPool){
            s += "; has a pool";
        }
        if(calcLotArea() > calcBuildingArea()){
            s += "; has a big open space";
        }
        return s;
    }
    /**
     * Overrides the equals method for comparing House objects
     */
    @Override
    public boolean equals(Object o){
        if(o instanceof House && calcBuildingArea() == ((House) o).calcBuildingArea() && ((House) o).hasPool() == mPool){
            return true;
        }
        return false;
    }
}
