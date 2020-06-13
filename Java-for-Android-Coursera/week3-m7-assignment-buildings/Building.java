package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    /**
     * Data Members
     */
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    /**
     * Constructor
     */
    public Building(int length, int width, int lotLength, int lotWidth){
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }
    /**
     * Getters
     */
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    /**
     * Mutators
     */
    public void setLength(int length){
        mLength = length;
    }
    public void setWidth(int width){
        mWidth = width;
    }
    public void setLotLength(int lotLength){
        mLotLength = lotLength;
    }
    public void setLotWidth(int lotWidth){
        mLotWidth = lotWidth;
    }
    /**
     * Calculation Methodes
     */
    public int calcBuildingArea(){
        return mWidth*mLength;
    }
    public int calcLotArea(){
        return mLotWidth*mLotLength;
    }
    /**
     * Converting into String
     */
    public String toString(){
        return "Building: " +  mLength + " * " + mWidth + ". Lot: " + mLotLength + " * " + mLotWidth;
    }
}
