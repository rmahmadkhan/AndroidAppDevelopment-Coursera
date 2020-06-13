package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    /**
     * Data Members
     */
    private String mBusinessName;
    private int mParkingSpaces = 0;
    private static int sTotalOffices = 0;
    /**
     * Constructors
     */
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }
    /**
     * Getters
     */
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    /**
     * Mutators
     */
    public void setBusinessName(String businessName){
        mBusinessName = businessName;
    }
    public void setParkingSpaces(int parkingSpaces){
        mParkingSpaces = parkingSpaces;
    }
    /**
     * Overrides the toString method
     */
    @Override
    public String toString(){
        String s = "Business: ";
        if(mBusinessName != null){
            s += mBusinessName;
        }
        else{
            s += "unoccupied";
        }
        if(mParkingSpaces != 0){
            s += "; has " + mParkingSpaces + " parking spaces";
        }
        // put the total int he String
        s += " (total offices: " + sTotalOffices + ")";
        return s;
    }
    /**
     * Overrides the equals method to compare Office objects
     */
    @Override
    public boolean equals(Object o){
        if(o instanceof Office && calcBuildingArea() == ((Office) o).calcBuildingArea()
                && getParkingSpaces() == ((Office) o).getParkingSpaces()){
            return true;
        }
        return false;
    }
}
