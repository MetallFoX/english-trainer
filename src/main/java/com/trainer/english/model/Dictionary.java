package com.trainer.english.model;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private String name;
    List<Word> words;

    public Dictionary() {
    }

    public Dictionary(String name) {
        this.name = name;
        this.words = new ArrayList<>();
    }

    public Dictionary(String name, List<Word> words) {
        this.name = name;
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public List<Word> getWords() {
        return words;
    }
}
