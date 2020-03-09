package com.bill99.boot.bootTest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/myServlet")
public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7903452672553282573L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>这是：MyServlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
