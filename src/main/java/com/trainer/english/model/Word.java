package com.trainer.english.model;

public class Word {
    private String text;
    private String meaning;
    private String translation;

    private Dictionary dictionary;

    public Word() {
    }

    public Word(String text, String meaning, String translation) {
        this.text = text;
        this.meaning = meaning;
        this.translation = translation;
    }

    public String getText() {
        return text;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getTranslation() {
        return translation;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

}
