package compras;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldo = limiteDoCartao;
        this.compras = new ArrayList<>();
    }
    
    public boolean lancarCompra(Compra compra){
        if (saldo > compra.getValor()) {
            this.saldo = saldo - compra.getValor();
            this.compras.add(compra);
            return true;
        }
        System.out.println("Compra negada");
        return false;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
    
    
    
    
    
}
