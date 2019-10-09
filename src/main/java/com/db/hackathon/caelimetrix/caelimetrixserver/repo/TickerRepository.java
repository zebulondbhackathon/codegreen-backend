package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Ticker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TickerRepository {
    List<Ticker> findTickers
}
