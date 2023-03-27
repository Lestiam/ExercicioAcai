package entidades;

public class Acai {
    private Double valor;
    private boolean maisSorvete;

    public Acai() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setMaisSorvete(boolean maisSorvete) {
        this.maisSorvete = maisSorvete;
    }

    public double calculaPreco(){
        if (maisSorvete)
            return this.getValor() + 2;
        else
            return this.getValor();
    }

    public void tamanhoAcai(int tamanho) {
        if (tamanho == 1) {
            this.setValor(8.00);
        }
        if (tamanho == 2) {
            this.setValor(10.00);
        }
        if (tamanho == 3) {
            this.setValor(12.00);
        }
    }
}
