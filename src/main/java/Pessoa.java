import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean verificaSeEMaiorDeIdade(){
        return getIdade() >= 18;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }
}
