package entity;

public class Player {

    private Person person;
    private boolean whiteSide = false;

    public Player(Person person, boolean whiteSide) {
        this.person = person;
        this.whiteSide = whiteSide;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isWhiteSide() {
        return whiteSide;
    }

    public void setWhiteSide(boolean whiteSide) {
        this.whiteSide = whiteSide;
    }
}
