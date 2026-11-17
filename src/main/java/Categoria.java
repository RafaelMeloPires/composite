import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemCardapio {

    private List<ItemCardapio> itens = new ArrayList<>();

    public Categoria(String descricao) {
        super(descricao);
    }

    public void addItem(ItemCardapio item) {
        if (item == null) {
            throw new IllegalArgumentException("Item inválido");
        }
        this.itens.add(item);
    }

    @Override
    public String getConteudo() {
        String saida = "Categoria: " + this.getDescricao() + "\n";
        for (ItemCardapio item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}