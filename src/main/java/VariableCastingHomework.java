public class VariableCastingHomework {

    public static void main(String [] args){
        byte byte1 = 50;
        short short1 = 120;
        int int1 = 5666;
        long long1 = 45677;
        float float1 = 39453094;
        double double1 = 20.48475;

        byte1 = (byte)short1;
        byte1 = (byte)int1;
        byte1 = (byte)long1;
        byte1 = (byte)float1;
        byte1 = (byte)double1;
        //======
        short1 = (short)int1;
        short1 = (short)long1;
        short1 = (short)float1;
        short1 = (short)double1;
        //======
        int1 = byte1;
        int1 = short1;
        int1 = (int)long1;
        int1 = (int)float1;
        int1 = (int)double1;
        //======
        long1 = short1;
        long1 = int1;
        long1 = byte1;
        long1 = (long)float1;
        long1 = (long)double1;
        //=======
        float1 = byte1;
        float1 = short1;
        float1 = int1;
        float1 = long1;
        float1 = (float)double1;
        //=======
        double1 = byte1;
        double1 = short1;
        double1 = int1;
        double1 = long1;
        double1 = float1;











































    }
}
