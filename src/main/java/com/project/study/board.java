package com.project.study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/board.do")
public class board extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//board.java

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/study/board.jsp");
		dispatcher.forward(req, resp);
	}

	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		StudyDAO dao = new StudyDAO();
		StudyDTO dto = new StudyDTO();
		
		String title= dto.getTitle();
		String content =dto.getContent();
		
		int result = dao.Setboard();
		
		
		
		
		
	}
	
}
