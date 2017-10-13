package com.trainer.english.dao;

import com.trainer.english.model.Word;

import java.util.HashMap;
import java.util.Map;

public class InMemoryWordDAO implements WordDAO {
    private Map<String, Word> words = new HashMap<>();

    public InMemoryWordDAO() {
        words.put("car", new Word("car", "A road vehicle, typically with four wheels, powered by an internal combustion engine and able to carry a small number of people", "Машина"));
        words.put("dog", new Word("dog", "A domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, and a barking, howling, or whining voice", "Собака"));
        words.put("apple", new Word("apple", "The round fruit of a tree of the rose family, which typically has thin red or green skin and crisp flesh. Many varieties have been developed as dessert or cooking fruit or for making cider", "Яблоко"));
    }

    @Override
    public Word getByText(String text) {
        return words.get(text);
    }

    @Override
    public void add(Word word) {
        words.put(word.getText(), word);
    }

    @Override
    public void remove(Word word) {
        words.remove(word.getText());
    }
}
