package observer4;

import observer4.Observador;

public class Assinante implements Observador {

    private String nome;
    private String endereco;

    public Assinante (String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public void atualizar(Revista revista, Edicao edicao) {
        System.out.println("==================== Notificação Assinante " + nome + " ====================");
        System.out.println("Assinante: " + nome);
        System.out.println("Revista: " + revista.getNome());
        System.out.println("Edição: " + edicao.getNumero());
    }
}
