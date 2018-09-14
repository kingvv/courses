package lesson6.game.characters;

public abstract class GameCharacter {


    private String nameCharacter = "noName";


    protected String getNameCharacter() {

        return nameCharacter;
    }

    protected void setNameCharacter(String nameCharacter) {

        this.nameCharacter = nameCharacter;
    }


    public abstract void hit();

}
