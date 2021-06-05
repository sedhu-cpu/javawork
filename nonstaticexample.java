public class nonstaticexample {
    
    public void throttle(){
        System.out.println("Car is going too fast");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is:" + maxSpeed);
    }

    public static void main(String[] args) {
      nonstaticexample myCar = new nonstaticexample();
      myCar.throttle();
      myCar.speed(200);  
    }
}
