/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip.facades;

import ar.gob.ambiente.servicios.srvafip.modelo.ExpedienteDrp;
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
public class ExpedienteDrpFacade extends AbstractFacade<ExpedienteDrp> {
    @PersistenceContext(unitName = "SrvAfipPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExpedienteDrpFacade() {
        super(ExpedienteDrp.class);
    }
    
    public ExpedienteDrp getExpXUsuario(String usuario){
        List<ExpedienteDrp> lstExp;
        em = getEntityManager();
        String queryString = "SELECT exp FROM ExpedienteDrp exp "
                + "WHERE exp.usuario = :usuario";
        Query q = em.createQuery(queryString)
                .setParameter("usuario", usuario);
        lstExp = q.getResultList();
        if(lstExp.isEmpty()){
            return null;
        }else{
            return lstExp.get(0);
        }
    }
    
    public List<ExpedienteDrp> getExpTranspXCuit(String cuit){
        em = getEntityManager();
        String queryString = "SELECT exp FROM ExpedienteDrp exp "
                + "WHERE exp.usuario LIKE :cuit "
                + "AND exp.tipo = 2";
        Query q = em.createQuery(queryString)
                .setParameter("cuit","%" + cuit + "%");
        return q.getResultList();
    } 
}
