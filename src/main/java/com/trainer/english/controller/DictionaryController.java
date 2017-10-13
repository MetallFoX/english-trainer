package com.trainer.english.controller;

import com.trainer.english.dao.DictionaryDAO;
import com.trainer.english.model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/dictionaries")
public class DictionaryController {

    private DictionaryDAO dao;

    public DictionaryController(@Autowired DictionaryDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/{name}", method = GET)
    Dictionary get(@PathVariable String name) {
        return dao.getByName(name);
    }

    @RequestMapping(value = "/", method = POST)
    void add(@RequestBody Dictionary dict) {
        dao.add(dict);
    }

    @RequestMapping(value = "/", method = DELETE)
    void remove(@RequestBody Dictionary dict) {
        dao.remove(dict);
    }
}