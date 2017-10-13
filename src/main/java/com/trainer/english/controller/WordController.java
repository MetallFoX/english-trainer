package com.trainer.english.controller;

import com.trainer.english.dao.WordDAO;
import com.trainer.english.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/words")
public class WordController {

    private WordDAO dao;

    public WordController(@Autowired WordDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(path = "/{text}", method = GET)
    Word get(@PathVariable String text) {
        return dao.getByText(text);
    }

    @RequestMapping(value = "/", method = POST)
    void add(@RequestBody Word word) {
        dao.add(word);
    }

    @RequestMapping(value = "/", method = DELETE)
    void remove(@RequestBody Word word) {
        dao.remove(word);
    }
}
