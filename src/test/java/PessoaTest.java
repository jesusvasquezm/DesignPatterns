import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    @DisplayName("Calcula se a idade da pessoa é maior de idade")
    void verificaSeEMaiorDeIdade(){
        Pessoa jesus = new Pessoa("Jesus", LocalDateTime.of(1998,3,23,13,10));
        Assertions.assertTrue(jesus.verificaSeEMaiorDeIdade());
    }

    @Test
    @DisplayName("Calcula se a idade da pessoa é a mesma do esperado")
    void calculaIdadeCorreta(){
        Pessoa jesus = new Pessoa("Jesus", LocalDateTime.of(1998,3,23,13,10));
        Assertions.assertEquals(25,jesus.getIdade());
    }



}