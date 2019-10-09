package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.EsgDataCsv;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.EsgDataCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/esgdata")
public class EsgDataCsvController {
    @Autowired
    private EsgDataCsvService esgDataCsvService;

    @GetMapping(value = "/all")
    public List<EsgDataCsv> getAllEsgData() {
        return esgDataCsvService.findAll();
    }

    @GetMapping(value = "/esgdata/{ric}")
    public ResponseEntity<List<EsgDataCsv>> getAllQuizesByCategory(@PathVariable("ric") String ric) {
        List<EsgDataCsv> esgDataCsvList = esgDataCsvService.getEsgDataByRic(ric);
        return ResponseEntity.ok().body(esgDataCsvList);
    }
}
