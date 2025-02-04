package tn.esprit.tp_foyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.service.IChambreService;

import java.util.List;

@Tag(name = "Gestion des chambres")
@RestController
@AllArgsConstructor
@NoArgsConstructor

@RequestMapping("/chambre")
public class ChambreRestController {
    @Autowired
    IChambreService chambreService;

    //http:localhost:8089/foyer/chambre/retrieve-all-chambres
    @Operation(description = "Récuperer tous les chambres")
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    //http:localhost:8089/foyer/chambre/retrieve-chambre/8
    @Operation(description = "Récuperer une chambre par son ID")
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long id) {
        return chambreService.retrieveChambre(id);
    }

    //http:localhost:8089/foyer/chambre/create-chambre
    @Operation(description = "Ajout d'une chambre")
    @PostMapping("/create-chambre")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }



    //http:localhost:8089/foyer/chambre/modify-chambre
    @Operation(description="Modification d'une chambre")
    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    //http:localhost:8089/foyer/chambre/retrieve-by-numero-chambre/300
    @Operation(description = "retrieve chambre by numero")
    @GetMapping("/retrieve-by-numero-chambre/{numero}")
    public Chambre retrieveChambreByNumero(@PathVariable Long numero){
        return chambreService.retrieveChambreByNumero(numero);
    }
}
