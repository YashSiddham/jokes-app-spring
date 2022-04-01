package com.siddhamyash.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quote;

    public JokesServiceImpl() {
        this.quote = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quote.getRandomQuote();
    }
}
