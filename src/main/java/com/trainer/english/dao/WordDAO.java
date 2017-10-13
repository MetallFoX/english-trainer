package com.trainer.english.dao;

import com.trainer.english.model.Word;

public interface WordDAO {
    Word getByText(String text);
    void add(Word word);
    void remove(Word word);
}
