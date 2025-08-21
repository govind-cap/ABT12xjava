package ex_19_OOPs_part2.multilevel;

public class Lab170_MultiLevel {
    Son rahul = new Son();
    Father f = new Father();
    GrandFather gf = new GrandFather();

    Son s1 = new Son();
    //Son s2 = new Father();
    Father f1 = new Son(); // Dynamic Dispatch.
    GrandFather gf1 = new Son();
    GrandFather gf2 = new Father();
//        Son s3 = new GrandFather();






}
