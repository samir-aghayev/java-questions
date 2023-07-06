package az.atlacademy.lesson172;

import java.util.Objects;

public final class Player implements Comparable<Player> {
    public final int score;
    public final String name;

    public Player(int id, String name) {
        this.score = id;
        this.name = name;
    }

    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player student)) return false;
        return getScore() == student.getScore() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScore(), getName());
    }

    @Override
    public String toString() {
        return "Player{id=%d, name='%s'}".formatted(score, name);
    }

    @Override
    public int compareTo(Player that) {
        return this.name.compareTo(that.name);
    }
}
