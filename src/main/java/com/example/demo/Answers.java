package com.example.demo;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

public class Answers {

    @NotNull
    @Size(min=3, max=20)
    private String name;

    @NotNull
    @Size(min=3, max=20)
    private String quest;

    @NotNull
    @Size(min=3, max=20)
    private String color;

    public Answers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
