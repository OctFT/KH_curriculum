package com.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.products.model.ProductDAO;
import com.products.model.ProductDTO;

@WebServlet("/insert_ok.do")
public class InsertOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InsertOkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String product_category = request.getParameter("product_category").trim();
		String product_name = request.getParameter("product_name").trim();
		String product_code = request.getParameter("product_code").trim();
		int product_input = Integer.parseInt(request.getParameter("product_input").trim());
		int product_output = Integer.parseInt(request.getParameter("product_output").trim());
		int product_transcode = Integer.parseInt(request.getParameter("product_transcost").trim());
		int product_mileage = Integer.parseInt(request.getParameter("product_mileage").trim());
		String product_company = request.getParameter("product_company").trim();
		
		ProductDTO dto = new ProductDTO();
		
		dto.setCategory_fk(product_category);
		dto.setProducts_name(product_name);
		dto.setEp_code_fk(product_code);
		dto.setInput_price(product_input);
		dto.setOutput_price(product_output);
		dto.setTrans_cost(product_transcode);
		dto.setMileage(product_mileage);
		dto.setCompany(product_company);
		
		ProductDAO dao = ProductDAO.getInstance();
		int res = dao.insertProduct(dto);
		
		PrintWriter out = response.getWriter();
		
		if(res > 0) {
			out.println("<script>");
			out.println("alert('제품 등록 성공')");
			out.println("location.href='select.do'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('제품 등록 실패')");
			out.println("history.back");
			out.println("</script>");
		}
	}

}
