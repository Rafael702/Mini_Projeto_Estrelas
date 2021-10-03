package br.com.zup.pessoa;

import br.com.zup.imc.Imc;
import br.com.zup.refeicoesdiarias.RefeicoesDiarias;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private List<Imc> paciente = new ArrayList<>();
    private List<RefeicoesDiarias> listaRefeicoes = new ArrayList<>();

    public Paciente() {
    }

    public void adicionarPaciente(Imc novoPaciente) {
        paciente.add(novoPaciente);
    }

    public void adicionarCardapio(RefeicoesDiarias novaRefeicao) {
        paciente.add(novaRefeicao);
    }

    @Override
    public String toString() {
        StringBuilder exibirPaciente = new StringBuilder();
        exibirPaciente.append("\n * Pacientes * " + paciente);
        return exibirPaciente.toString();
    }
}
