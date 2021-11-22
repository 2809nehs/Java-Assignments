package Inheritance;

public class BedRoom extends Home{

  BedRoom(int noofLights,String roomName){
      super(noofLights,roomName);
  }

  public void nooflights(){
      System.out.println("Room is: "+roomName);
      System.out.println("No. of lights: "+noofLights);
    }
}
