/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.servicios.srvafip;

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
}
