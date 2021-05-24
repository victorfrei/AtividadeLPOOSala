
package interfaces;


public class Triatleta extends Pessoa implements Nadador, Ciclista, Corredor {

    public Triatleta(String nome) {
        super(nome);
    }
    
    @Override
    public void nadar() {
        System.out.println(this.getNome() + "está nadando");
    }

    @Override
    public void aquecer() {
        System.out.println(this.getNome() + "está aquecendo");
    }

    @Override
    public void correrDeBicicleta() {
        System.out.println(this.getNome() + "está correndo de bike");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + "está correndo");
    }
    
}
