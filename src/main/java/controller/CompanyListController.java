package controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import frontcontroller.CommonInterface;
import model.CompanyService;
import vo.CompanyVO;

public class CompanyListController implements CommonInterface {

	@Override
	public String execute(Map<String, Object> data) throws Exception {
		HttpServletRequest request = (HttpServletRequest) data.get("request");
		HttpSession session = request.getSession();
	
		CompanyService service = new CompanyService();
		List<CompanyVO> companyList = service.companyList();
		
		request.setAttribute("companyList", companyList);
		
		return "/company/company_list.jsp";
	}

}
