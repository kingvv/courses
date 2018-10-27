package lesson6;


import lesson6.game.characters.GameCharacter;
import lesson6.game.characters.Spiderman;
import lesson6.game.characters.Superman;

public class Runner {

    public static void main(String[] args) {


        GameCharacter superman = new Superman("Кларк Кент");

        System.out.println(String.format("-----------Показатели %s------------------------\n", superman.getNameCharacter()));

        superman.runCharacter(100);
        superman.jumpCharacter();
        superman.shootingCharacter();
        superman.swimingCharacter();

        GameCharacter spiderman = new Spiderman("Питер Паркер");

        System.out.println(String.format("-----------Показатели %s------------------------\n", spiderman.getNameCharacter()));


        spiderman.runCharacter(100);
        spiderman.jumpCharacter();
        spiderman.shootingCharacter();
        spiderman.swimingCharacter();
    }

}
