package lesson6.game.characters;

import lesson6.game.action.IRun;
import lesson6.game.action.IShooting;

public class ManFlashCharacter extends GameCharacter implements IRun, IShooting{


    public ManFlashCharacter() {
        super.setNameCharacter(ManFlashCharacter.class.getSimpleName());
    }

    @Override
    public void hit() {
        System.out.println(super.getNameCharacter() + " is " + "beating!");
    }
    @Override
    public String run() {
        return super.getNameCharacter() + " is " + "running!";
    }

    @Override
    public String shoot() {
        return super.getNameCharacter() + " is " + "shooting!";
    }
}
