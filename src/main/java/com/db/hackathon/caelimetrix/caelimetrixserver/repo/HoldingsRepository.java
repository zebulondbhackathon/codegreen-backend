package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.Holdings;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HoldingsRepository extends CrudRepository<Holdings, String> {


    List<Holdings> findHoldingsByClient(String client);

    @Override
    List<Holdings> findAll();

}
