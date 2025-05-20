/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.model.entity.Worker;

/**
 *
 * @author DELL
 */
@Stateless
public class WorkerFacade extends AbstractFacade<Worker> implements WorkerFacadeLocal {

    @PersistenceContext(unitName = "WorkersManagementEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WorkerFacade() {
        super(Worker.class);
    }
    
}
