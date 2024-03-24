package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1972, 5, 16); 
        Pessoa pessoa = new Pessoa("João", dataNascimento, "Engenheiro");

        int idade = pessoa.calcularIdade();

        if (idade > 150) {
            System.out.println("Idade inválida! A idade máxima permitida é de 150 anos.");
        } else {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
            System.out.println("Profissão: " + pessoa.getProfissao());
            System.out.println("Idade: " + idade + " anos");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
