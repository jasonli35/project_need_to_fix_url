package com.example.cse110_project.prevcourses;

import java.util.Arrays;
import java.util.List;

public class DummyStudent implements IStudent {
    private final int id;
    private final String name;
    private final String[] courses;

    public DummyStudent(int id, String name, String[] courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getCourses() { return Arrays.asList(courses); }

}
