package ex_19_OOPs_part2.singleinheritance;

public class Lab_168_SI {
    public static void main(String[] args) {
        Son pavan = new Son();
        System.out.println(pavan.gold_f);
        pavan.bhk2();
        pavan.bhk3();

        Cousin c = new Cousin();
        // c.bhk3();
//        System.out.println(c.gold_f);


    }
}
