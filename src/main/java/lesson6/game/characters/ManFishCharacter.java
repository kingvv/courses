package lesson6.game.characters;

import lesson6.game.action.IJump;
import lesson6.game.action.ISwimming;

public class ManFishCharacter extends GameCharacter implements ISwimming, IJump{


    public ManFishCharacter() {
        super.setNameCharacter(ManFishCharacter.class.getSimpleName());
    }

    @Override
    public String swim() {
        return super.getNameCharacter() + " is " + "swimming!";
    }

    @Override
    public void hit() {
        System.out.println(super.getNameCharacter() + " is " + "beating!\n");
    }


    @Override
    public String jump() {
        return super.getNameCharacter() + " is " + "jumping!";
    }
}
