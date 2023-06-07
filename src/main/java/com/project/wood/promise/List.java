package com.project.wood.promise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;

import com.project.wood.promise.repository.PromiseDAO;
import com.project.wood.promise.repository.PromiseDTO;


@WebServlet("/promise/list.do")
public class List extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		HttpSession session = req.getSession();
		session.setAttribute("id", "bwgOXg113");
		
		
		
		//list.java
		PromiseDAO dao = new PromiseDAO();
		PromiseDTO dto = new PromiseDTO();
		
		

		
		java.util.List<PromiseDTO> tlist = dao.list();
		
		req.setAttribute("tlist", tlist);
		System.out.println(tlist);
		

		java.util.List<PromiseDTO> list = dao.getTag();

		req.setAttribute("list", list);
		System.out.println(list);
		
		//req.setAttribute("dto", dto);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/promise/list.jsp");
		dispatcher.forward(req, resp);
	}
	
	

	

	

}
