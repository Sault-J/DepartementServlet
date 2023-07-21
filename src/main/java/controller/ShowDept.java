package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptPair;
import service.NumDeptMapper;

/**
 * Servlet implementation class ShowDept
 */
@WebServlet("/ShowDept")
public class ShowDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public ShowDept() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String deptNum = request.getParameter("dept-num").trim();
		System.err.println("Num de département = " + deptNum);
		
		//New
		NumDeptMapper ndm = new NumDeptMapper();   
		String deptName = ndm.findDept(deptNum);
		System.out.println(deptName);
		String address;
		
		 if (deptNum.isEmpty()) {
		      address = "missing-num.jsp";
		    } else if (deptName != null) {
		      address = "show-departement-1.jsp";
		    } else {
		      address = "unknown-num-1.jsp";
		    }		
		
		//Haute-savoie -> deptName
		
		DeptPair deptPair = new DeptPair(deptNum, deptName);
		request.setAttribute("key", deptPair);
		request.getRequestDispatcher(address).forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
