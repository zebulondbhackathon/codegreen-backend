package com.db.hackathon.caelimetrix.caelimetrixserver.service;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.TradeData;
import com.db.hackathon.caelimetrix.caelimetrixserver.repo.TradeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeDataService {
    @Autowired
    private TradeDataRepository repository;

    public List<TradeData> getTradeDataByRic(String ric) {
        return repository.findTradeDataByRic(ric);
    }

    public List<TradeData> findAll() {
        return repository.findAll();
    }
}
