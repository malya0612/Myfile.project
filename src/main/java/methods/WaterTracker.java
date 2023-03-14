package methods;

public class WaterTracker {
    int totalWater;
    int inTake;
    public void addWater(int amount){
        totalWater = totalWater + amount;
    }

    public int getWaterIntake(){
        inTake = 3200;
        return inTake;
    }
    public String getStatus (){
        if (totalWater == 2000){
            return "You are hydrated!";
        }
        if (totalWater < 2000){

        } return "You need to drink more water";

    }

    public static void main(String[] args) {
        WaterTracker str = new WaterTracker();
       str.addWater(2000);
        System.out.println(str.getStatus());
        System.out.println(str.totalWater);
        System.out.println(str.getWaterIntake());
    }


}
