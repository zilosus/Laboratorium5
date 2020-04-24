import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Collections;

public class Zadanie3 {
    static void zadanie3(){

        ArrayList<Integer> lista = new ArrayList<>();
        int x;
        int z = 0;
        while(true){            //"z<10" zmienić na true aby pętla działała według polecenia. Niestety może zająć dużo czasu zanim 0 wypadnie...
            x = new Random().nextInt(Integer.MAX_VALUE);
            System.out.println(x);
            lista.add(x);
            if(x == 0){
                break;
            }
            z++;
        }
        System.out.println("Lista: ");
        System.out.println(lista);

        System.out.println("Pierwsze 5 wyników: ");
        for(int i = 0; i < 5; i ++){
            System.out.println(Math.addExact(i,1) + " element listy to: " + lista.get(i));
        }
        System.out.println("Ostatnie 5 wyników: ");
        for(int j = 4; j >= 0; j--){
            System.out.println(Math.subtractExact(lista.size(),j) + " element listy to: " + lista.get(Math.subtractExact(Math.subtractExact(lista.size(),j),1)));
        }

        Collections.sort(lista);
        System.out.println("Posortowana lista: ");
        System.out.println(lista);
    }
}
