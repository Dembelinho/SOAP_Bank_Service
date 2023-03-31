package server;

import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9292/",new BanqueService());
        System.out.println("Web service deployed on the address 0.0.0.0:9292");
    }
}
