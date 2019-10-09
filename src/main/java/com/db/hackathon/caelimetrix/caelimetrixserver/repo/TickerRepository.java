package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Ticker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TickerRepository extends CrudRepository<Ticker, String> {

    List<Ticker> findTickerBySource(String source);

    @Override
    List<Ticker> findAll();
}
