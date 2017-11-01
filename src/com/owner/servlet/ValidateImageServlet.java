package com.owner.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateImageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Random random = new Random();
	
	private String getValidateCode(){
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<4;i++){
			buf.append((char) (random.nextInt(26)+65));
		}
		
		return buf.toString();
		
	}

	private BufferedImage createValidateImage(String code) {
		
		BufferedImage image = new BufferedImage(100, 40, BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics drawpen = image.getGraphics();
		
		drawpen.setColor(Color.YELLOW);
		
		drawpen.fillRect(0, 0, 100, 40);
		
		drawpen.setColor(new Color(0, 0, 255));
		
		drawpen.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 20));
		
		for(int i=0;i< code.length();i++){
			drawpen.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
			drawpen.drawString(String.valueOf(code.charAt(i)), 10+i*20, 30);
		}
		for(int i=0;i< 10;i++){
			drawpen.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
			drawpen.drawLine(random.nextInt(100), random.nextInt(40), random.nextInt(100), random.nextInt(40));
		}
		for(int i=0;i< 500;i++){
			drawpen.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
			drawpen.drawOval(random.nextInt(100), random.nextInt(40), 1, 1);
		}
		
		return image;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("image/png");
		
		ServletOutputStream sos = resp.getOutputStream();
		String validateCode = getValidateCode();
		HttpSession session  =  req.getSession();
		session.setAttribute("sessionValidateCode", validateCode);
		ImageIO.write(createValidateImage(validateCode), "png", sos);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
