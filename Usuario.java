import lombok.*;
import java.util.Date; // ou java.time.LocalDate

@Getter 
@ToString
@Builder
public class Usuario {    
    private Long id; 
    private String nome;
    private String sobrenome;
    private String email;
    private Date idade;
    private String genero;
 }
 