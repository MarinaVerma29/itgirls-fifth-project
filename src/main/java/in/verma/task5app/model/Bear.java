package in.verma.task5app.model;

public class Bear extends AbstractAnimal{
    @Override
    void poop(){
        System.out.println("Я медведь и я какаю большими какашками.");
    }

    @Override
    void bite(){
        super.bite();
        System.out.println("Я медведь и я могу разодрать тебя на тряпки!");

    }
}
