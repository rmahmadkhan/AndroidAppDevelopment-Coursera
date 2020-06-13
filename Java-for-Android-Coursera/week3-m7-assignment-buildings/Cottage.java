package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {

    /**
     * Data Members
     */
    private boolean mSecondFloor;
    /**
     * Constructors
     */
    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension, dimension, lotLength, lotWidth);
    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }
    /**
     * Method to check if a house has second floor
     */
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }
    /**
     * Returns the info of object in the form of String
     */
    @Override
    public String toString(){
        String s = super.toString();
        if(mSecondFloor){
            s += "; is a two story cottage";
        }
        else{
            s += "; is a cottage";
        }
        return s;
    }
}

