package br.com.fatecmogidascruzes.pizzaria_mario.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    private String id;
    @DBRef
    private Cliente cliente;

    @DBRef
    private List<Produto> produtos;

    
    private StatusPedido status;

    private Double valorTotal;

    private LocalDateTime dataHora;
}
