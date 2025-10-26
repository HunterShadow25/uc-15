
import Beans.Livros;
import DAO.LivrosDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nickc 
 * suite de teste do programa
 */
public class Suite {

    public Suite() {
    }
    LivrosDAO livros = new LivrosDAO();

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        LivrosDAO livros = new LivrosDAO();
    }

    @After
    public void tearDown() {
    }
//teste se o cadastro de livros está funcionando

    @Test
    public void cadastrarLivro() {
        try {
            Livros li = new Livros();
            li.setNome("livro de teste");
            li.setGenero("açao, drama, fantasia");
            li.setAutor("george r.r martin");
            li.setDescricao("um dos maiores livros ja criados");
            li.setPreco(100.00);
            livros.inserir(li);

        } catch (Exception e) {

        }
    }
//testa se o livro foi cadastrado corretamente 
    @Test
    public void lista() {
        try {
            assertTrue(livros.getLivro("livro de teste").size() >= 1);

        } catch (Exception e) {

        }
    }
//deleta o livro de teste cadastrado
    @Test
    public void apagarLivro() {

        try {

            livros.excluirComNome("livro de teste");
        } catch (Exception e) {

        }
    }

}
