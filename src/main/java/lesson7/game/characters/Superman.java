package lesson7.game.characters;

public class Superman extends GameCharacter {


    public Superman(String nameCharacter) {
        super(nameCharacter);

        super.run = distance -> distance / 100;
        super.shooting = () -> System.out.println("Стреляет лазерами глазами");
        super.jump = () -> 40;
        super.swimming = () -> 200;

    }
}
