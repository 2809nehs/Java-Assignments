package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class CollegeDetails {

    private String collegeName;
    private ArrayList<String> departmentName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public ArrayList<String> getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(ArrayList<String> departmentName) {
        this.departmentName = departmentName;
    }

}

class Application{
    public static void main(String[] args) {

        CollegeDetails cd[]=new CollegeDetails[5];

        cd[0]=new CollegeDetails();
        cd[0].setCollegeName("IIT");
        cd[0].setDepartmentName(new ArrayList<String>(List.of("CS","ECE","IT")));

        cd[1]=new CollegeDetails();
        cd[1].setCollegeName("NIT");
        cd[1].setDepartmentName(new ArrayList<String>(List.of("AERO","AUTO","EEE")));

        cd[2]=new CollegeDetails();
        cd[2].setCollegeName("IIIT");
        cd[2].setDepartmentName(new ArrayList<String>(List.of("MECH","EI")));

        cd[3]=new CollegeDetails();
        cd[3].setCollegeName("LPU");
        cd[3].setDepartmentName(new ArrayList<String>(List.of("CS","MECH","IT")));

        cd[4]=new CollegeDetails();
        cd[4].setCollegeName("IIT-D");
        cd[4].setDepartmentName(new ArrayList<String>(List.of("CS","EC","IT","AERO","EI","EEE")));

        for(int i=0;i<5;i++){
            System.out.println(cd[i].getCollegeName());
            System.out.println(cd[i].getDepartmentName());
        }





    }
}

