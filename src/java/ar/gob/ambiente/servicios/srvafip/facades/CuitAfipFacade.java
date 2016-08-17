/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip.facades;

import ar.gob.ambiente.servicios.srvafip.facades.AbstractFacade;
import ar.gob.ambiente.servicios.srvafip.modelo.CuitAfip;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    public List<CuitAfip> getCuitXRazonSocial(String razonSocial){
        em = getEntityManager();
        String queryString = "SELECT cuit FROM CuitAfip cuit "
                + "WHERE cuit.pejRazonSocial LIKE :razonSocial";
        Query q = em.createQuery(queryString)
                .setParameter("razonSocial", "%" + razonSocial + "%");        
        return q.getResultList();

    }
}
