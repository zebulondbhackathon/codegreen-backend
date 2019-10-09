package com.db.hackathon.caelimetrix.caelimetrixserver.service;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Holdings;
import com.db.hackathon.caelimetrix.caelimetrixserver.repo.HoldingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoldingsService {

    @Autowired
    private HoldingsRepository repository;

    public List<Holdings> getHoldingsByClient(String client) {
        return repository.findHoldingsByClient(client);
    }

    public List<Holdings> findAll() {
        return repository.findAll();
    }
}
