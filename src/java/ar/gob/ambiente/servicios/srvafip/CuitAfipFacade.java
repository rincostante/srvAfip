/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rincostante
 */
@Stateless
public class CuitAfipFacade extends AbstractFacade<CuitAfip> {
    @PersistenceContext(unitName = "SrvAfipPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuitAfipFacade() {
        super(CuitAfip.class);
    }

}
