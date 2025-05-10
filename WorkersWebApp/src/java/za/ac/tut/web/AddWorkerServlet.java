/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AddWorkerServlet extends HttpServlet {
@EJB WorkerFacadeLocal wfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String dobStr = request.getParameter("dob");
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
    
        Date dob = sdf.parse(dobStr);
    
        
        Worker work = createWorker(id , name, age, dob);
        wfl.create(work);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_worker_outcome.jsp");
        disp.forward(request, response);
        
    } catch (ParseException ex) {
        Logger.getLogger(AddWorkerServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public Worker createWorker(Long id, String name, Integer age, Date dob){
        Worker work = new Worker();
        
        work.setId(id);
        work.setName(name);
        work.setAge(age);
        work.setDob(dob);
        
        return work;
    }
}
