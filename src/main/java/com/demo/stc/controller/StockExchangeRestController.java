package com.demo.stc.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.stc.dao.StockExchangeDao;
import com.demo.stc.model.StockExchange;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StockExchangeRestController {
	@Autowired
	StockExchangeDao stockExchangeDao;

	@GetMapping(value = "/stock-exchange-list")
	public List<StockExchange> stockexchangelist() {

		System.out.println("Getting Stock Exchange List ");
		return stockExchangeDao.findAll();
	}

	@PostMapping("/stock-exchange-insert-page")
	public void insert(@RequestBody StockExchange stockExchange) throws ClassNotFoundException, SQLException {
		stockExchangeDao.save(stockExchange);
	}

}
