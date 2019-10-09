package com.db.hackathon.caelimetrix.caelimetrixserver;

import com.db.hackathon.caelimetrix.caelimetrixserver.service.EsgDataCsvService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.HoldingsService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TickerService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TradeDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CaelimetrixServerApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(CaelimetrixServerApplication.class);

	@Autowired
	private EsgDataCsvService esgDataCsvService;

	@Autowired
	private TradeDataService tradeDataService;

	@Autowired
	private TickerService tickerService;

	@Autowired
	private HoldingsService holdingsService;

	public static void main(String[] args) {
		SpringApplication.run(CaelimetrixServerApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

		log.info("esgDataCsvService('QEP.N')");
		esgDataCsvService.getEsgDataByRic("QEP.N").forEach(x -> log.info("ESG Data: {}", x));

		log.info("Trade Data By RIC 'QEP.N'");
		tradeDataService.getTradeDataByRic("QEP.N").forEach(x -> log.info("Trade Data: {}", x));

		log.info("Ticker Data By source 'MSCI'");
		tickerService.getTickerDataBySource("MSCI").forEach(x -> log.info("Ticker Data: {}", x));

		log.info("Holdings Data By client 'Aleysha'");
		holdingsService.getHoldingsByClient("Aleysha").forEach(x -> log.info("Holdings Data: {}", x));

	}
}
