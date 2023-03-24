import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Napoje> napojelist = new ArrayList<>();
        napojelist.add(new Cola("ColaZero"));
        napojelist.add(new Monster("Monarch"));
        napojelist.add(new Woda("Musowianka"));
        for(Napoje n: napojelist){
            n.pij();
        }

        Comparator<Napoje> n = new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                int n1 = o1.getNazwa().compareTo(o2.getNazwa());
                if(n1 ==0) {
                    n1 = o1.getNazwa().compareTo(o2.getNazwa());
                }
                return n1;


            }
        };
        napojelist.sort(n);
        for(Napoje n2: napojelist){
            System.out.println(n2.getNazwa());
        }


     KochajacyProgramowac kochajacyProgramowac = new KochajacyProgramowac() {
         @Override
         public void programuj() {
            System.out.println("programuj");
         }
     };
        Function<String,Integer> zwroc = (s) -> s.length();
        System.out.println(zwroc.apply("eo"));

        Consumer<Integer> wyswietl = (w) -> System.out.println("Dostanę ocene: "+w);
        wyswietl.accept(3);

        BiFunction<Integer,Integer,Integer> iloczyn = (x,y) -> x*y;

        System.out.println(iloczyn.apply(2,4));
    }
}