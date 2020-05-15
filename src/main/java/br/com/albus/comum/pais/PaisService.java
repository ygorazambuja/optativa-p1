package br.com.albus.comum.pais;

import br.com.albus.generic.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/albus/pais")
public class PaisService extends GenericService<PaisController, Pais, PaisRepository, Long> {

}
