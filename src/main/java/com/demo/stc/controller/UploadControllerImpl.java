package com.demo.stc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadControllerImpl {
	
	@RequestMapping("/import_excel_page")
	public String import_excel_page()
	{
		return "import_stock_page";
	}

}
