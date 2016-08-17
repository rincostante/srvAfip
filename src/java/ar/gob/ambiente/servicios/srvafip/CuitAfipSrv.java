

package ar.gob.ambiente.servicios.srvafip;

import ar.gob.ambiente.servicios.srvafip.facades.CuitAfipFacade;
import ar.gob.ambiente.servicios.srvafip.facades.ExpedienteDrpFacade;
import ar.gob.ambiente.servicios.srvafip.modelo.CuitAfip;
import ar.gob.ambiente.servicios.srvafip.modelo.ExpedienteDrp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 * Fachada que expone los métodos de búsqueda de los facades
 * @author rincostante
 */
@Stateless
@LocalBean
public class CuitAfipSrv {

    @EJB
    private CuitAfipFacade personaFacade;
    @EJB
    private ExpedienteDrpFacade expedienteFacade;
    
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
    
    public ExpedienteDrp getExpediente(String usuario){
        ExpedienteDrp exp = new ExpedienteDrp();
        Date date;
        
        try{    
            exp = expedienteFacade.getExpXUsuario(usuario);
            logger.log(Level.INFO, "Ejecutando el método getExpediente() desde el servicio");
        }catch(Exception ex){
            date = new Date(System.currentTimeMillis());
            logger.log(Level.SEVERE, "Hubo un error al ejecutar el método getExpediente() desde el servicio CuitAfip. " + date + ". ", ex);
        }
        return exp;
    }
    
    public List<CuitAfip> getCuit(String razonSocial){
        List<CuitAfip> lstCuit = new ArrayList<>();
        Date date;
        
        try{    
            lstCuit = personaFacade.getCuitXRazonSocial(razonSocial);
            logger.log(Level.INFO, "Ejecutando el método getCuit() desde el servicio");
        }catch(Exception ex){
            date = new Date(System.currentTimeMillis());
            logger.log(Level.SEVERE, "Hubo un error al ejecutar el método getCuit() desde el servicio CuitAfip. " + date + ". ", ex);
        }
        return lstCuit;
    }
    
    public List<ExpedienteDrp> getExpTransportistas(String cuit){
        List<ExpedienteDrp> lstTransp = new ArrayList<>();
        Date date;
        
        try{    
            lstTransp = expedienteFacade.getExpTranspXCuit(cuit);
            logger.log(Level.INFO, "Ejecutando el método getExpTransportistas() desde el servicio");
        }catch(Exception ex){
            date = new Date(System.currentTimeMillis());
            logger.log(Level.SEVERE, "Hubo un error al ejecutar el método getExpTransportistas() desde el servicio CuitAfip. " + date + ". ", ex);
        }
        return lstTransp;
    }

}
