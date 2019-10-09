package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.TradeData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeDataRepository extends CrudRepository<TradeData, String> {
    List<TradeData> findTradeDataByRic(String ric);

    @Override
    List<TradeData> findAll();
}
