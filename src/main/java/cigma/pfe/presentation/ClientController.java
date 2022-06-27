package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    IClientService IClientService;

    @PostMapping("/add")
    public Client save(@RequestBody Client c){
        return IClientService.save(c);
    }

    @PutMapping("/modify")
    public Client modify(@RequestBody Client clt) {
        return IClientService.modify(clt);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long idClt) {
        IClientService.remove(idClt);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return IClientService.getOne(idClt);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return IClientService.getAll();
    }

    public IClientService getIClientService() {
        return IClientService;
    }
}
