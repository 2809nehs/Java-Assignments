package Inheritance;

public class Application {

    public static void main(String[] args) {

        BedRoom bedroom=new BedRoom(2,"Bed Room");
        bedroom.nooflights();

        DrawingRoom drawingroom=new DrawingRoom(6,"Drawing Room");
        drawingroom.nooflights();

        StudyRoom studyroom=new StudyRoom(4,"Study Room");
        studyroom.nooflights();
    }
}
