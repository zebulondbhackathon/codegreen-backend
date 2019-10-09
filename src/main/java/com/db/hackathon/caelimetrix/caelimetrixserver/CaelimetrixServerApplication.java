package com.db.hackathon.caelimetrix.caelimetrixserver;

import com.db.hackathon.caelimetrix.caelimetrixserver.service.EsgDataCsvService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TickerService;
import com.db.hackathon.caelimetrix.caelimetrixserver.service.TradeDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

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

	public static void main(String[] args) {
		SpringApplication.run(CaelimetrixServerApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

//        repository.save(new EsgDataCsv("Java"));
//        repository.save(new EsgDataCsv("Node"));
//        repository.save(new EsgDataCsv("Python"));
//
//        System.out.println("\nfindAll()");
//        repository.findAll().forEach(x -> System.out.println(x));
//
//        System.out.println("\nfindById(1L)");
//        repository.findById(1l).ifPresent(x -> System.out.println(x));

		log.info("esgDataCsvService('QEP.N')");
		esgDataCsvService.getEsgDataByRic("QEP.N").forEach(x -> log.info("ESG Data: {}", x));

		log.info("Trade Data By RIC 'QEP.N'");
		tradeDataService.getTradeDataByRic("QEP.N").forEach(x -> log.info("Trade Data: {}", x));

		log.info("Ticker Data By source 'MSCI'");
		tickerService.getTickerDataBySource("MSCI").forEach(x -> log.info("Ticker Data: {}", x));

	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
