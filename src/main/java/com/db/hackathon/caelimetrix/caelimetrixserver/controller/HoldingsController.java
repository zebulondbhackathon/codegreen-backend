package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Holdings;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.HoldingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/holdings")
public class HoldingsController {

    private static final Logger log = LoggerFactory.getLogger(HoldingsController.class);

    @Autowired
    private HoldingsService holdingsService;

    @GetMapping(value = "/all")
    public List<Holdings> getAllHoldings() {
        return holdingsService.findAll();
    }

    @GetMapping(value = "/client/{client}")
    public ResponseEntity<List<Holdings>> getAllHoldingsByClient(@PathVariable("client") String client) {
        log.info("getAllHoldingsByClient({})", client);
        List<Holdings> holdings = holdingsService.getHoldingsByClient(client);
        holdings.forEach(x -> log.info("Holdings Data: {}", x));
        return ResponseEntity.ok().body(holdings);
    }
}
