package pl.piomin.microservices.client.api;

import org.springframework.web.bind.annotation.RestController;
import pl.piomin.microservices.client.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class Api {

    private List<Client> clients;

    protected Logger logger = Logger.getLogger(Api.class.getName());

    public Api(){
        clients = new ArrayList<>();
        clients.add(new Client());
    }
//    public Api() {
//        accounts = new ArrayList<>();
//        accounts.add(new Account(1, 1, "111111"));
	
}
