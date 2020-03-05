package com.study.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProductDao dao = new IProductDaoImpl();

	public ProductServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if (method.equals("add")) {
			add(request, response);
		}
		else if (method.equals("delete")) {
			delete(request, response);
		}
		else if (method.equals("update")) {
			update(request, response);
		}
		else if (method.equals("find")) {
			find(request, response);
		}
		else if (method.equals("list")) {
			list(request, response);
		}
	}

	protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Product> list = dao.findAll();
			// 把查询结果保存到请求对象中
			request.setAttribute("products", list);
			// 转发请求
			request.getRequestDispatcher("list.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
