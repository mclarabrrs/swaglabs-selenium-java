package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.HomePage;
import page.LoginPage;


public class LoginSteps {

    //variavel que referencia a classe criada || inicializa a variavel
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage;

    @Dado("que o usuario acesse a plataforma")
    public void queOUsuarioAcesseAPlataforma() {
        loginPage.acessarPlataforma();
        homePage = new HomePage(loginPage.driver);
    }

    @Quando("informar as credenciais validas")
    public void informarAsCredenciaisValidas() {
        loginPage.informarCredenciais();
    }

    @Então("visualizaria a home da plataforma")
    public void visualizariaAHomeDaPlataforma() {
        homePage.validarLoginSucesso();
    }

    @E("efetura o logout com sucesso")
    public void efeturaOLogoutComSucesso() {
        homePage.fazerLogout();

    }
}
