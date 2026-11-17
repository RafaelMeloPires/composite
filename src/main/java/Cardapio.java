public class Cardapio {

    private ItemCardapio item;

    public void setItem(ItemCardapio item) {
        this.item = item;
    }

    public String getCardapio() {
        if (this.item == null) {
            throw new IllegalArgumentException("Cardápio sem itens");
        }
        return this.item.getConteudo();
    }
}