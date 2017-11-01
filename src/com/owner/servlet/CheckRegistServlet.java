package com.owner.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.owner.model.User;

@SuppressWarnings("all")
@WebServlet("/checkUserName.do")
public class CheckRegistServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stubusername
		String username = (String) req.getParameter("username");
		//从数据库中获取所有已注册的用户，判断是否包含了新注册用户
//		List<User> allUser = dao.queryAllUser(); 
		List<String> allUser = new ArrayList<String>();
		allUser.add("悟空");
		allUser.add("八戒");
		allUser.add("abc");
		req.setAttribute("checkResult", !allUser.contains(username));
		req.getRequestDispatcher("jsp/register_check_name.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
