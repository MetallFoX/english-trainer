package com.trainer.english.dao;

import com.trainer.english.model.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDictionaryDAO implements DictionaryDAO {
    private Map<String, Dictionary> dictionaries = new HashMap<>();

    public InMemoryDictionaryDAO() {
        dictionaries.put("vehicles", new Dictionary("vehicles"));
        dictionaries.put("animals", new Dictionary("animals"));
        dictionaries.put("fruits", new Dictionary("fruits"));
    }

    @Override
    public Dictionary getById(String id) {
        return null;
    }

    @Override
    public Dictionary getByName(String name) {
        return dictionaries.get(name);
    }

    @Override
    public void add(Dictionary dict) {
        dictionaries.put(dict.getName(), dict);
    }

    @Override
    public void remove(Dictionary dict) {
        dictionaries.remove(dict.getName());
    }
}
