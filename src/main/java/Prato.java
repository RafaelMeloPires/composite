public class Prato extends ItemCardapio {

    public Prato(String descricao) {
        super(descricao);
    }

    @Override
    public String getConteudo() {
        return "Prato: " + this.getDescricao() + "\n";
    }
}