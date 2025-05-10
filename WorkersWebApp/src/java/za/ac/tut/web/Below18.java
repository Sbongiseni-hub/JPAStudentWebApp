/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.WorkerFacadeLocal;
import za.ac.tut.model.entity.Worker;

/**
 *
 * @author DELL
 */
public class Below18 extends HttpServlet {

    @EJB
    private WorkerFacadeLocal wfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Worker> worker = wfl.getBelow18();
        request.setAttribute("worker", worker);
        
        RequestDispatcher disp = request.getRequestDispatcher("under_18.jsp");
        disp.forward(request, response);
    }

}
