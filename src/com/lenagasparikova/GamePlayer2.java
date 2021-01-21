package com.lenagasparikova;

import java.util.ArrayList;
import java.util.List;

public class GamePlayer2 implements IReadAll {
    private String name;
    private String weapon;
    private int score;
    private int rating;

    public GamePlayer2(String name, String weapon, int score, int rating) {
        this.name = name;
        this.weapon = weapon;
        this.score = score;
        this.rating = rating;
    }

    @Override
    public void read(List<String> list) {
        name = list.get(0);
        weapon = list.get(1);
        score = Integer.parseInt(list.get(2));
        rating = Integer.parseInt(list.get(3));
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, weapon);
        values.add(2, "" + score);
        values.add(3, "" + rating);
        return values;
    }
}
