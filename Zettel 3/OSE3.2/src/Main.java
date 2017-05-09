/**
 * Created by nico on 09/05/17.
 */
public class Main {
    public void main(String[] args){
        Food food;
        food = new Cauliflower();
        System.out.println(food.getMeal());
        food = new Spaghetti();
        System.out.println(food.getMeal());
        /*
            Hier bekommen wir 2 verschiedene Ausgaben, und zwar einmal "Blumenkohl an Gorgonzolasoße" und beim
            zweiten Mal "Spaghetti Bologneser Art". Das liegt daran, dass Food food nur angibt, dass die
            zugewiesene Klasse das Interface Food implementiert (und damit eine function getMeal() implementieren
            muss. Da wir zwei verschiedene Klassen, die Food implementieren, hintereinander zuweisen, geben
            die zwei Aufrufe von food.getMeal() auch zwei verschiedene Ausgaben. Sie sind gebunden an die jeweilige
            Implementierung der getMeal() Funktion in der entsprechenden Klasse.
         */

        food = new Lasagna();
        System.out.println(food.getMeal());
    }
}
