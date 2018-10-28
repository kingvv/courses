package lesson7.game.characters;

public class Spiderman extends GameCharacter {


    public Spiderman(String nameCharacter) {

        super(nameCharacter);

        super.run = distance -> distance / 30;
        super.jump = () -> 20;
        super.shooting = () -> System.out.println("Стрляет паутиной");
        super.swimming = () -> 200;
    }
}
