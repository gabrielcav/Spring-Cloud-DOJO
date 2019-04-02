package pl.piomin.microservices.client.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
        clients.add(new Client(1,"Rua A","11","Campinas",true));
        clients.add(new Client(2,"Rua B","22","Campinas",true));
        clients.add(new Client(3,"Rua C","33","Campinas",true));
        clients.add(new Client(4,"Rua D","44","Campinas",false));
        clients.add(new Client(5,"Rua E","55","Argirita",true));
    }
    
	@RequestMapping("/clients/{id}")
	public Client findById(@PathVariable("id") String id) {
		logger.info(String.format("Clients.findByNumber(%s)", id));
		return clients.stream().filter(it -> it.getId().equals(id)).findFirst().get();
	}	
}
