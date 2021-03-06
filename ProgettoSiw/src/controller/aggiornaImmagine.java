package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utente;
import persistence.UtenteDAO;
import persistence.UtenteDAOJDBC;

/**
 * Servlet implementation class aggiornaImmagine
 */
@WebServlet("/aggiornaImmagine")
public class aggiornaImmagine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aggiornaImmagine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getParameter("p");
		((Utente) request.getSession().getAttribute("user")).setImmagineProfilo(path);
		//System.out.println(path);
		UtenteDAO t = new UtenteDAOJDBC();
		t.aggiornaImmagine(path,(Utente)request.getSession().getAttribute("user"));
		//request.getSession().setAttribute("user",u);
	}

}
