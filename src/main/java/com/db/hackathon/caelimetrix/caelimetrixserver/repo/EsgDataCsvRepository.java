package com.db.hackathon.caelimetrix.caelimetrixserver.repo;

import com.db.hackathon.caelimetrix.caelimetrixserver.entitiy.EsgDataCsv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EsgDataCsvRepository extends CrudRepository<EsgDataCsv, String> {
    List<EsgDataCsv> findEsgDataCsvByRic(String ric);
}
