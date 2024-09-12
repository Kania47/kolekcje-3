import java.lang.reflect.Array;
import java.util.*;

public class Main {

    /**
     * Metoda wylosujListe - Losuje liste liczb całkowitych w zakresie od 1 do 100
     * @param ileElementow - Liczba wylosowanych elementów
     * @return - Arrayliste z liczbami wylosowanymi
     */
    private static ArrayList<Integer> wylosujListe(int ileElementow) {
        //prywatna statyczna, tablica,   nazwa,      ile elementow
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 10 + 1);

            while (listaLiczbWylosowanychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 10 + 1);
            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        return listaLiczbWylosowanychBezPowtorzen;
        System.out.println("elko");
    }

    /**
     * @param listaDoWypisania - Funkcja która wypisuje daną liste
     */
    private static void wypiszListe(List<Integer> listaDoWypisania) {
        System.out.println("Twoja Lista");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i));

        }
    }

    /**
     * @param ileElementow - Funkcja która pozwala nam wstawić liczby do listy
     * @return - zwraca
     */
    private static ArrayList<Integer> wstawLiczbyDoListy(int ileElementow) {

        ArrayList<Integer> listaliczbZklawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ileElementow + " Liczb:");
        for (int i = 0; i < ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            listaliczbZklawiatury.add(liczba);
        }
        return listaliczbZklawiatury;
    }


    /**
     * @param listaliczbZklawiatury - Jest to lista liczb które wpisze użytkownik
     * @param listaLiczbWylosowanychBezPowtorzen - Lista liczb bez możliwości ich powtórzenia
     * @return - zwraca
     */
    private static LinkedList<Integer> zwrocElementyZObuList(ArrayList<Integer> listaliczbZklawiatury, ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen) {
        LinkedList<Integer> trafioneLiczby = new LinkedList<>();
        for (Integer wpisana : listaliczbZklawiatury) {
            if (listaLiczbWylosowanychBezPowtorzen.contains(wpisana)) {
                trafioneLiczby.add(wpisana);
            }
        }
        System.out.println("trafione");
        System.out.println(trafioneLiczby);
        return trafioneLiczby;
    }


    public static void main(String[] args) {


        ArrayList<Integer> losowe = wylosujListe(6);
        wypiszListe(losowe);
        ArrayList<Integer> wpisane = wstawLiczbyDoListy(6);
        wypiszListe(wpisane);
        LinkedList<Integer> trafione =zwrocElementyZObuList(losowe, wpisane);
        wypiszListe(trafione);
    }
}


















//Laczenie z githubem!!!!!!
//1. git init
//2. git config user.name "nazwa"
//3. git config user.email "email"
//4. git add .
//5. git commit -m "nazwa commita"
//6. git remote add origin "link do repo"
//7. git push -u origin master
//8. git push

//jak juz masz

// git add .
// git commit -m "commit"
// git push