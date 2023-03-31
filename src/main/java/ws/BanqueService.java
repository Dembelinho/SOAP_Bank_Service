package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")

public class BanqueService {
    @WebMethod
    public double conversion(@WebParam double montant){
        return montant*10;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code){
        return new Compte(code, Math.random()*9000,new Date());
    }
    @WebMethod(operationName = "listofComptes")
    public List<Compte> comptesList(){
        List<Compte> list=new ArrayList<>();
        list.add(new Compte(1,Math.random()*9000,new Date()));
        list.add(new Compte(2,Math.random()*9000,new Date()));
        list.add(new Compte(3,Math.random()*9000,new Date()));
        return list;
    }

}
