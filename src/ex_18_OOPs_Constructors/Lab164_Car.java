package ex_18_OOPs_Constructors;

public class Lab164_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name="Tesla modal 3";
        tesla.year= 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);



        Car nano = new Car();
        nano.name="TaTa nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);


    }
}
