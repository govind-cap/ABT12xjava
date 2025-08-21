package ex_18_OOPs_Constructors;

public class Car2 {
    String model;
    int year;

    Car2(){
        model = "xxx";
        year = 1994;
        System.out.println("dc");
    }

     Car2(String model_name,int year_created){
        this("3000");
        this.model= model_name;
        this.year = year_created;
    }
    Car2(String modal_name){
        this.model = modal_name;
    }


}
