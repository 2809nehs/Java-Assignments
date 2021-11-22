package Inheritance;

import Inheritance.Home;

public class DrawingRoom extends Home {

    DrawingRoom(int noofLights,String roomName) {
        super(noofLights, roomName);
    }

        public void nooflights(){
            System.out.println("Room is: "+roomName);
            System.out.println("No. of lights: "+noofLights);
        }


    }


