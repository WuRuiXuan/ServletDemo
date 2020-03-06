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
		// 把请求数据重新编码（只针对请求方式为POST，必须写在getParameter之前，否则无效）
		request.setCharacterEncoding("UTF-8");
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
		String name = request.getParameter("name");
		float price = Float.valueOf(request.getParameter("price"));
		int nums = Integer.valueOf(request.getParameter("nums"));
		String description = request.getParameter("description");
		
		Product p = new Product(name, price, nums, description);
		try {
			dao.add(p);
			// 跳转
			response.sendRedirect(request.getContextPath() + "/ProductServlet?method=list");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.valueOf(request.getParameter("pid"));
		try {
			dao.delete(pid);
			response.sendRedirect(request.getContextPath() + "/ProductServlet?method=list");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.valueOf(request.getParameter("pid"));
		String name = request.getParameter("name");
		float price = Float.valueOf(request.getParameter("price"));
		int nums = Integer.valueOf(request.getParameter("nums"));
		String description = request.getParameter("description");
		
		Product p = new Product(pid, name, price, nums, description);
		try {
			dao.update(p);
			response.sendRedirect(request.getContextPath() + "/ProductServlet?method=list");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.valueOf(request.getParameter("pid"));
		try {
			Product p = dao.findById(pid);
			// 把查询结果保存到请求对象中
			request.setAttribute("product", p);
			// 转发请求
			request.getRequestDispatcher("update.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Product> list = dao.findAll();
			request.setAttribute("products", list);
			request.getRequestDispatcher("list.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
