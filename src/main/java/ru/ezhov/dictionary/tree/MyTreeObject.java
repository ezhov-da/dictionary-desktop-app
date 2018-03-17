package ru.ezhov.dictionary.tree;


public class MyTreeObject {
    private int id;

    private String One;

    private int lvl;

    private String little;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOne() {
        return this.One;
    }

    public void setOne(String One) {
        this.One = One;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getLittle() {
        return this.little;
    }

    public void setLittle(String little) {
        this.little = little;
    }

    public String toString() {
        return this.One;
    }
}