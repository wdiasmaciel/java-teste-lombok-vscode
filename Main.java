import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1, usuario2;
        
        usuario1 = Usuario.builder().nome("Ana").build();
        System.out.println("Usuário(a) " + usuario1.getNome() + ": " + usuario1.toString());

        usuario2 = Usuario.builder()
                .nome("Diana")
                .sobrenome("Silva")
                .email("ana.silva@example.com")
                .idade(new Date())
                .genero("Feminino")
                .build();
        System.out.println("Usuário(a) " + usuario2.getNome() + ": " + usuario2.toString());

        if (usuario1.equals(usuario1))
            System.out.println("O objeto \'usuario1\' é igual a si próprio!");
        if (usuario2.equals(usuario2))
            System.out.println("O objeto \'usuario2\' é igual a si próprio!");
        if (!usuario1.equals(usuario2))
            System.out.println("Os objetos \'usuario1\' e \'usuario2\' são diferentes!");

        System.out.println("Hash code do objeto \'usuario1\': " + usuario1.hashCode());
        System.out.println("Hash code do objeto \'usuario2\': " + usuario2.hashCode());
    }
}