package com.trainer.english;

import com.trainer.english.dao.DictionaryDAO;
import com.trainer.english.dao.InMemoryDictionaryDAO;
import com.trainer.english.dao.InMemoryWordDAO;
import com.trainer.english.dao.WordDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@org.springframework.context.annotation.Configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    WordDAO wordDAO() {
        return new InMemoryWordDAO();
    }

    @Bean
    DictionaryDAO dictionaryDAO() {
        return new InMemoryDictionaryDAO();
    }
}
