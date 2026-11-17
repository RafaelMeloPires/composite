import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void deveRetornarCardapioCompleto() {
        Categoria principal = new Categoria("Cardápio");

        Categoria massas = new Categoria("Massas");
        massas.addItem(new Prato("Lasanha"));
        massas.addItem(new Prato("Espaguete"));

        Categoria sobremesas = new Categoria("Sobremesas");
        sobremesas.addItem(new Prato("Pudim"));

        principal.addItem(massas);
        principal.addItem(sobremesas);

        Cardapio cardapio = new Cardapio();
        cardapio.setItem(principal);

        assertEquals("Categoria: Cardápio\n" +
                "Categoria: Massas\n" +
                "Prato: Lasanha\n" +
                "Prato: Espaguete\n" +
                "Categoria: Sobremesas\n" +
                "Prato: Pudim\n", cardapio.getCardapio());
    }

    @Test
    void deveRetornarApenasUmPrato() {
        Cardapio cardapio = new Cardapio();
        cardapio.setItem(new Prato("Feijoada"));

        assertEquals("Prato: Feijoada\n", cardapio.getCardapio());
    }

    @Test
    void deveRetornarExcecaoCardapioSemItens() {
        try {
            Cardapio cardapio = new Cardapio();
            cardapio.getCardapio();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cardápio sem itens", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoItemNulo() {
        try {
            Categoria categoria = new Categoria("Bebidas");
            categoria.addItem(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Item inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDescricaoVazia() {
        try {
            new Prato("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição inválida", e.getMessage());
        }
    }
}