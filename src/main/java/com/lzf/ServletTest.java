package com.lzf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoTest daoTest = new DaoTest();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTest() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("ServletTest构造函数");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet函数");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("<p>莫记仇：Servlet Test</p>");
		List<SysConfig> sysConfigs = daoTest.selectSysConfig();
		response.getWriter().write(sysConfigs.toString());
	}

}
