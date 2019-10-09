package com.db.hackathon.caelimetrix.caelimetrixserver.service;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.EsgDataCsv;
import com.db.hackathon.caelimetrix.caelimetrixserver.repo.EsgDataCsvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TickerService {
    @Autowired
    private EsgDataCsvRepository repository;

    public List<EsgDataCsv> findAll() {
        return null;
    }
}
