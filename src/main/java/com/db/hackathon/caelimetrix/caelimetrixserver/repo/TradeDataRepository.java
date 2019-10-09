package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.TradeData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeDataRepository {
    List<TradeData>;
}
