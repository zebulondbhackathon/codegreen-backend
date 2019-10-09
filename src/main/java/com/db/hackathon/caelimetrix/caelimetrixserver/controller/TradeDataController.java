package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.TradeData;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TradeDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tradedata")
public class TradeDataController {
    @Autowired
    private TradeDataService tradeDataService;

    @GetMapping(value = "/all")
    public List<TradeData> getAllTradeData() {
        return tradeDataService.findAll();
    }

    private static final Logger log = LoggerFactory.getLogger(TradeDataController.class);

    @GetMapping(value = "/ric/{ric:.+}")
    public ResponseEntity<List<TradeData>> getAllTradeDataByRic(@PathVariable("ric") String ric) {
        log.info("getAllTradeDataByRic({})", ric);
        List<TradeData> tradeDataList = tradeDataService.getTradeDataByRic(ric);
        tradeDataList.forEach(x -> log.info("Trade Data: {}", x));
        return ResponseEntity.ok().body(tradeDataList);
    }
}
