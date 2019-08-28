package com.demo.stc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.stc.dao.StockExchangeDao;
import com.demo.stc.model.StockExchange;

@Service
public class StockExchangeServiceImpl {

	@Autowired
	StockExchangeDao stockexchangedao;
	public StockExchange insertStockExchange(StockExchange stockexchange) throws Exception
	{
		return stockexchangedao.save(stockexchange);
		
	}

}
