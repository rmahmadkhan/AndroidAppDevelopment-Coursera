package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    // METHODES
    // SETTERs
    public boolean setSwing(int direction){
        if(direction == IN || direction == OUT || direction == CLOSED){
            mSwing = direction;
            return true;
        }
        return false;
    }
    public boolean open(int direction){
        if(direction == IN || direction == OUT){
            return setSwing(direction);
        }
        return false;
    }
    public void close(){
        mSwing = CLOSED;
    }
    //GETTER
    public int getSwingDirection(){
        return mSwing;
    }

    public int thru(int count){
        if(mSwing == IN){
            return +count;
        }
        else if(mSwing == OUT){
            return -count;
        }
        else
            return 0;
    }

    public String toString(){
        // a gate that is closed
        if(mSwing == CLOSED){
            return "This gate is closed";
        }
        // a gate that has opened to swing IN
        else if(mSwing == IN){
            return "This gate is open and swings to enter the pen only";
        }
        // a gate that been opened swing OUT
        else if(mSwing == OUT){
            return "This gate is open and swings to exit the pen only";
        }
        // a gate that has a swing value other than IN, OUT, or CLOSED
        else
            return "This gate has an invalid swing direction";
    }

}
