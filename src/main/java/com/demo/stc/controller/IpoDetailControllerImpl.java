package com.demo.stc.controller;

import java.sql.SQLException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.demo.stc.dao.IpoDetailDao;
import com.demo.stc.model.IpoDetail;

@Controller
public class IpoDetailControllerImpl {
	
	@Autowired
	IpoDetailDao ipoDetaildao;
	@RequestMapping("/ipodetails_insert_page")
	public String company_insert_page(Model model) {
		IpoDetail ipoDetail = new IpoDetail();
		model.addAttribute("ipoDetail", ipoDetail);
		return "create_ipo_details";
	}

	@RequestMapping(value = "/insert_ipo_details", method = RequestMethod.POST)
	public String insert(@Valid @ModelAttribute("ipoDetail") IpoDetail ipoDetail, BindingResult result, Model model)
			throws SQLException {
		{
			try {

				ipoDetaildao.save(ipoDetail);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "redirect:/company-list";
		}

	}
}
