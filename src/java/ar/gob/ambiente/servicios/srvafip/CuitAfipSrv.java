/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author rincostante
 */
@Stateless
@LocalBean
public class CuitAfipSrv {

    @EJB
    private CuitAfipFacade personaFacade;
    private static final Logger logger = Logger.getLogger(CuitAfip.class.getName());
    
    public CuitAfip getPersona(Long cuit){
        CuitAfip per = new CuitAfip();
        Date date;
        
        try{
            per = personaFacade.find(cuit);
            logger.log(Level.INFO, "Ejecutando el método getPersona() desde el servicio");
        }
        catch (Exception ex){
            date = new Date(System.currentTimeMillis());
            logger.log(Level.SEVERE, "Hubo un error al ejecutar el método getPersona() desde el servicio CuitAfip. " + date + ". ", ex);
        }
        return per;
    }
}
