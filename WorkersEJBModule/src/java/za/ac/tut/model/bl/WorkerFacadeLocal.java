/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Worker;

/**
 *
 * @author DELL
 */
@Local
public interface WorkerFacadeLocal {

    void create(Worker worker);

    void edit(Worker worker);

    void remove(Worker worker);

    Worker find(Object id);

    List<Worker> findAll();

    List<Worker> findRange(int[] range);

    int count();
    
}
