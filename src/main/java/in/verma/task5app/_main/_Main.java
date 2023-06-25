package in.verma.task5app._main;

import in.verma.task5app.model.Bear;
import in.verma.task5app.model.Fox;
import in.verma.task5app.model.Goat;
import in.verma.task5app.model.Vet;

public class _Main {
    public static void main(String[]args){

        Vet vet = new Vet();
        Bear bear = new Bear();
        Fox fox = new Fox();
        Goat goat = new Goat();

        System.out.println("Сейчас ветеринар соберет кал на анализ");
        System.out.println("***");
        vet.makePoop(bear);
        System.out.println("***");
        vet.makePoop(fox);
        System.out.println("***");
        vet.makePoop(goat);
        System.out.println("***");

        System.out.println("Сейчас ветеринар зайдет в клетку!");
        System.out.println("***");
        vet.makeBite(bear);
        System.out.println("***");
        vet.makeBite(fox);
        System.out.println("***");
        vet.makeBite(goat);
        System.out.println("***");

    }
}
