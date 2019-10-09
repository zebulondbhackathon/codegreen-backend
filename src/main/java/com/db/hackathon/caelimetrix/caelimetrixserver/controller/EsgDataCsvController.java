package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.EsgDataCsv;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.EsgDataCsvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/esgdata")
public class EsgDataCsvController {
    private static final Logger log = LoggerFactory.getLogger(EsgDataCsvController.class);

    @Autowired
    private EsgDataCsvService esgDataCsvService;

    @GetMapping(value = "/all")
    public List<EsgDataCsv> getAllEsgData() {
        return esgDataCsvService.findAll();
    }

    @GetMapping(value = "/ric/{ric:.+}")
    public ResponseEntity<List<EsgDataCsv>> getAllEsgDataByRic(@PathVariable("ric") String ric) {
        log.info("getAllEsgDataByRic({})", ric);
        List<EsgDataCsv> esgDataCsvList = esgDataCsvService.getEsgDataByRic(ric);
        esgDataCsvList.forEach(x -> log.info("ESG Data: {}", x));
        return ResponseEntity.ok().body(esgDataCsvList);
    }
}
