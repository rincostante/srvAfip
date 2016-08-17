/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip;

import ar.gob.ambiente.servicios.srvafip.modelo.CuitAfip;
import ar.gob.ambiente.servicios.srvafip.modelo.ExpedienteDrp;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author rincostante
 */
@WebService(serviceName = "CuitAfipWs")
@Stateless()
public class CuitAfipWs {
    
    @EJB
    private CuitAfipSrv cuitAfipSrv;

    /**
     * Método para obtener la persona a partir del CUIT
     * @param cuit
     * @return 
     */
    @WebMethod(operationName = "verPersona")
    public CuitAfip verPersona(@WebParam(name = "cuit") Long cuit) {
        return cuitAfipSrv.getPersona(cuit);
    }
    
    @WebMethod(operationName = "verExpediente")
    public ExpedienteDrp verExpediente(@WebParam(name = "usuario") String usuario){
        return cuitAfipSrv.getExpediente(usuario);
    }
    
    @WebMethod(operationName = "verCuit")
    public List<CuitAfip> verCuit(@WebParam(name = "razonSocial") String razonSocial){
        return cuitAfipSrv.getCuit(razonSocial);
    }    
    
    @WebMethod(operationName = "verTranspXCuit")
    public List<ExpedienteDrp> verExpTranspXCuit(@WebParam(name = "cuit") String cuit){
        return cuitAfipSrv.getExpTransportistas(cuit);
    }         
}
