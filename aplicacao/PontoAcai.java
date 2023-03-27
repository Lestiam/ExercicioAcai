package aplicacao;

import entidades.Acai;

import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {
        int tamanho = 0;
        char resposta = ' ';
        Acai acai = new Acai();

        tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "1. 300 ml \n2. 500 ml \n3. 700 ml",
                "Informe o tamanho do Açaí desejado: ", JOptionPane.PLAIN_MESSAGE));
        if (tamanho == 1 || tamanho == 2 || tamanho == 3) {

            acai.tamanhoAcai(tamanho);
            resposta = JOptionPane.showInputDialog(null, "Haverá acréscimo de sorvete? S/N", "Acréscimo?",
                    JOptionPane.PLAIN_MESSAGE).toUpperCase().charAt(0);
            if (resposta == 'S')
                acai.setMaisSorvete(true);
            else
                acai.setMaisSorvete(false);

            JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai.calculaPreco(),
                    "Valor", JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Opção inválida! ",
                    "Erro", JOptionPane.ERROR_MESSAGE);

    }
}
