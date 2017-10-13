package com.trainer.english.dao;

import com.trainer.english.model.Dictionary;

public interface DictionaryDAO {

    Dictionary getById(String id);
    Dictionary getByName(String name);
    void add(Dictionary dict);
    void remove(Dictionary dict);
}
