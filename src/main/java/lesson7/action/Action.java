package lesson7.action;

public enum Action {

    Superman((int el)->el * 2),
    Batman((int el)->el * 4);


    Action(IJump j) {
    }

}
