package br.com.fatecmogidascruzes.pizzaria_mario;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PizzariaMarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaMarioApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if (usuarioRepository.findByUsername("admin@pizzaria.com").isEmpty()) {
				Usuario admin = new Usuario();
				admin.setUsername("admin@pizzaria.com");
				admin.setEmail("admin@pizzaria.com");
				admin.setNome("Administrador");
				admin.setPassword(passwordEncoder.encode("senha123"));
				usuarioRepository.save(admin);
				System.out.println("Usuário admin@pizzaria.com criado com senha 'senha123'");
			}
		};
	}
}