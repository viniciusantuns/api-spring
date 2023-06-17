package br.net.lol.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.net.lol.model.*;


@CrossOrigin
@RestController
public class UsuarioREST {
	public static List<Usuario> lista = new ArrayList<>();

	@PostMapping("/login")
	Usuario login(@RequestBody Login login) {
		System.out.print(login.getEmail());
		Usuario usuario = lista.stream().
				filter(usu -> usu.getEmail().equals(login.getEmail()) && 
						usu.getSenha().equals(login.getSenha())).
				findAny().orElse(null);
		return usuario;
	}
	
	
	@GetMapping("/login")
	List<Usuario> listarTodos() {
		return lista;
	}
	
	
	static {
		lista.add(new Usuario(1, "administr", "admin@admin.com", "1234", "Funcionario"));
		lista.add(new Usuario(2, "cliente", "cliente@cliente.com", "1234", "Cliente"));
		
	}
}
