package wellington.org.herome.dao;

public class Hero {
    public enum POWERSORIGIN { ACCIDENT, MUTATION, BORN };
    public enum POWERCHOSEN { TURTLE, LIGHTNING, FLIGHT, WEB, LASER, STRENGTH};

    private POWERSORIGIN origin;
    private POWERCHOSEN chosen;

    public POWERSORIGIN getOrigin() {
        return origin;
    }

    public Hero setOrigin(POWERSORIGIN origin) {
        this.origin = origin;
        return this;
    }

    public POWERCHOSEN getChosen() {
        return chosen;
    }

    public Hero setChosen(POWERCHOSEN chosen) {
        this.chosen = chosen;
        return this;
    }
}
