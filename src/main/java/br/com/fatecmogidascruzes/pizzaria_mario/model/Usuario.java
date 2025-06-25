package br.com.fatecmogidascruzes.pizzaria_mario.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private String id;

	private String username;
    private String email;
    private String nome;
    private String password;
    private String[] roles;

}
