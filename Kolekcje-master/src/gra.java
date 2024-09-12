import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class gra {

    private ArrayList<Integer> wylosowane;
    private ArrayList<Integer> wpisane;
    private LinkedList<Integer> trafione;

    private void wylosujLiczby(int ile) {
        for (int i = 0; i < ile; i++) {
            int liczba = (int) (Math.random() * 10 + 1);
            while (wylosowane.contains(liczba)) {
                liczba = (int) (Math.random() * 10 + 1);
            }
            wylosowane.add(liczba);
        }

    }

    private void wpiszZKlawiatury(int ile) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ile + " Liczb:");
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }

    private void wypiszKolekcje(List<Integer> lista){
        System.out.println("Twoja Lista");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }

    }
    private void sprawdz() {
        for (Integer wpisana : wpisane) {
            if (wylosowane.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }

    }

    private void zagraj(){
        wylosujLiczby(6);
        wpiszZKlawiatury(6);
        sprawdz();
        System.out.println("Wylosowane");
        wypiszKolekcje(wylosowane);
        System.out.println("wpisane");
        wypiszKolekcje(wpisane);
        System.out.println("trafione");
        wypiszKolekcje(trafione);
    }
}
