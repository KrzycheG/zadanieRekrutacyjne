
public class main {


    public static void main(String[] args) {

        Mutable<String> start = new Mutable<>("Banana",
                                new Mutable<>("Apple",
                                new Mutable<> ("Coconout", null)));

        Immutable<String> start2 =  new Immutable<>("Banana",
                                    new Immutable<>("Apple",
                                    new Immutable<> ("Coconout", null)));

        while(start2 != null){

            System.out.println(start2.data());
            start2 = (Immutable<String>) start2.next();

        }

        System.out.println();
    }


}
