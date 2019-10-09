package com.db.hackathon.caelimetrix.caelimetrixserver.service;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Ticker;
import com.db.hackathon.caelimetrix.caelimetrixserver.repo.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TickerService {
    @Autowired
    private TickerRepository repository;

    public List<Ticker> getTickerDataBySource(String source) {
        return repository.findTickerBySource(source);
    }

    public List<Ticker> findAll() {
        return repository.findAll();
    }
}
