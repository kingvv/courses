package lesson6.game.characters;

import lesson6.game.action.IJump;
import lesson6.game.action.IRun;
import lesson6.game.action.IShooting;
import lesson6.game.action.ISwimming;

public abstract class GameCharacter {


    protected IJump jump;
    protected IRun run;
    protected IShooting shooting;
    protected ISwimming swimming;


    private String nameCharacter;

    public GameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }


    public void jumpCharacter() {
        System.out.println(String.format("%s прыгает в длину на %s м", nameCharacter, jump.jump()));
    }


    public void runCharacter(int distanceToMeter) {
        System.out.println(String.format("%s пробежал дистанцию %s м за %s с", nameCharacter, distanceToMeter, run.run(distanceToMeter)));
    }

    public void shootingCharacter() {
        shooting.shoot();
    }

    public void swimingCharacter() {
        System.out.println(String.format("%s проплывает %s м", nameCharacter, swimming.swim())); swimming.swim();
    }

}
