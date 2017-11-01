package com.owner.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.owner.model.User;

@SuppressWarnings("serial")
@WebServlet("/login.do")
public class loginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String sessionValidateCode = (String) session.getAttribute("sessionValidateCode");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String userValidateCode = req.getParameter("validateCode");
		
//		List<User> exitUser = loginDao.querryUser();
//		if (exitUser.contain())
				
		PrintWriter pw = resp.getWriter();
				
		if (sessionValidateCode.equalsIgnoreCase(userValidateCode)){
			pw.print("<span style='color:red'>登录成功！</span><br></br>");

		}else{
			pw.println("<span style='color:red'>登陆失败</span>");
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
}
