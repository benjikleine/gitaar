package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class eigenaar {

    private String name;
    private String sex;
    private int age;
    private List<Gitaar> Gitaars;

    public String getName() { return name; }

    public void setName( String name ) { this.name = name; }

    public String getSex() { return sex; }

    public void setSex( String sex ) { this.sex = sex; }

    public int getAge() { return age; }

    public void setAge( int age ) { this.age = age; }

    public eigenaar( String name ) {
        this.name = name;
        this.Gitaars = new ArrayList<>();
    }

    public void addGitaar(Gitaar gitaar) {
    }
}
