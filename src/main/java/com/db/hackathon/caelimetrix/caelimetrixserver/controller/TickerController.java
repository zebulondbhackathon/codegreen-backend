package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.EsgDataCsv;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.EsgDataCsvService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ticker")
public class TickerController {
    @Autowired
    private TickerService tickerService;

    @GetMapping(value = "/all")
    public List<EsgDataCsv> getAllEsgData() {
        return tickerService.findAll();
    }
}
