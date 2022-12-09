public class PrincipalComputador {
    public static void main(String[] args) {
        Computador imb = new Computador();
        Computador HP = new Computador();

        //computadorDell.alterarValor(300,99);
        // Atribuiro os valores do computardor(SETAR)
        // computadorDell.setMarca("DELL");
        computadorHp.imprimir();
        
       // computadorHp.alterarValor()
        // Atribuiro os valores do computardor(SETAR)
        // computadorDell.setMarca("DELL");
        

    }
}

class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public int numeroSerie;
    public float preco;
    // Adicionar variaveis que faltam
    // Criar GET e SET

    void imprimir() {
        System.out.println(marca);
        System.out.println(cor);
        System.out.println(modelo);
        System.out.println(numeroSerie);
        System.out.println(preco);
        // System.out.println(cor);
        // Printar todas variaveis da classe Comoutador
    }

    void calcularValor() {
        // Colocar if e else - hp ibm
        // Verrificar a marca e atribuir a porcentagem em cima do preço
        if(marca == "HP") {
            preco = preco * 1.30;
        }

        if(imb){
            preco = preco * 1.50;
        }

        else{
        }
    }

    void alterarValor(float v) {
        // proco = v;
        calcularValor();
    }

    void setMarca(String m) {
        marca = m;
    }

    String getMarca() {
        return marca;
    }

    void setCor(String c) {
        cor = c;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String o) {
        modelo = o;
    }

    String getModelo() {
        return modelo;
    }

    void setNumeroSerie(int n) {
        numeroSerie = n;
    }

    int getNumeroSerie() {
        return numeroSerie;
    }

    void setPreco(float p) {
        preco = p;
    }

    float getPreco() {
        return preco;
    }


}
