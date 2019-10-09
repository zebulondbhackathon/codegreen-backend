package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Ticker;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TickerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ticker")
public class TickerController {
    private static final Logger log = LoggerFactory.getLogger(TickerController.class);

    @Autowired
    private TickerService tickerService;

    @GetMapping(value = "/all")
    public List<Ticker> getAllTickerData() {
        return tickerService.findAll();
    }

    @GetMapping(value = "/source/{source}")
    public ResponseEntity<List<Ticker>> getAllTickerDataBySource(@PathVariable("source") String source) {
        log.info("getAllTickerDataBySource({})", source);
        List<Ticker> tickerList = tickerService.getTickerDataBySource(source);
        tickerList.forEach(x -> log.info("Ticker Data: {}", x));
        return ResponseEntity.ok().body(tickerList);
    }
}
