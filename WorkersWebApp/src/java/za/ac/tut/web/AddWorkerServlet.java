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
        Long id = Long.parseLong(request.getParameter("idNumber"));
        String names = request.getParameter("fullNames");
        String surname = request.getParameter("surname");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phoneNum = request.getParameter("phone");
        String strDob = request.getParameter("dob");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = sdf.parse(strDob);
        
        Worker worker = createWorker(id, names, surname, dob, address, email, phoneNum);
        wfl.create(worker);
        
        request.setAttribute("id", id);
        request.setAttribute("surname", surname);
        request.setAttribute("names", names);
        
            RequestDispatcher disp = request.getRequestDispatcher("add_worker_output.jsp");
            disp.forward(request, response);
        
        } catch (ParseException ex) {
            Logger.getLogger(AddWorkerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private Worker createWorker(Long id,String names, String surname, Date birthDate,String address,String email,String phoneNumber){
        Worker work = new Worker();
        work.setId(id);
        work.setNames(names);
        work.setSurname(surname);
        work.setBirthDate(new Date());
        work.setAddress(address);
        work.setEmail(email);
        work.setPhoneNumber(phoneNumber);
        
        return work;
    }

}
