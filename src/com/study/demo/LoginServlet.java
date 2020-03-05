package com.study.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 两种请求方式：
 * get请求：显式请求，在URL上会显示参数，大小不能超过4KB，不安全但请求速度快
 * post请求：隐式请求，不会在URL上会显示参数，大小没有限制，安全但请求速度慢
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取客户端的表单数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// 获取向页面的输出流
		PrintWriter out = response.getWriter();
		
		if (!username.equals("admin") || !password.equals("123")) {
			out.println("error");
		}
		else {
			out.println("success");
		}
	}

}
