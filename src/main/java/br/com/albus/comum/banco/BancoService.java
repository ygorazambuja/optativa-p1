package br.com.albus.comum.banco;

import br.com.albus.generic.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/albus/banco")
public class BancoService extends GenericService<BancoController, Banco, BancoRepository, Long> {

}
