package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners.html", "owners/index","owners/index.html",""})
    public String listControllers(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners";
    }

    @RequestMapping("/owners/find")
    public String findOwners(){
        return "notimplemented";
    }
}
