/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Worker;

/**
 *
 * @author DELL
 */
@Stateless
public class WorkerFacade extends AbstractFacade<Worker> implements WorkerFacadeLocal {

    @PersistenceContext(unitName = "WorkersEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WorkerFacade() {
        super(Worker.class);
    }

    @Override
    public Long getWorkersCount() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Worker s");
        Long cnt = (Long)query.getSingleResult();
        return cnt;
    }

    @Override
    public List<Worker> getBelow18() {
        Query query = em.createQuery("SELECT s FROM Worker s WHERE s.age < 18");
        List<Worker> list = (List<Worker>)query.getResultList();
        return list;
    }
    
}
