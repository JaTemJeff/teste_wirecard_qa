import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ConsultarTodosOsClientesTest extends BaseTest{

    @Test
    public void consultaTodosOsClientesTest(){
       given()
           .auth()
           .preemptive()
           .basic(TOKEN, CHAVE)
           .header("Accept", ContentType.JSON.getAcceptHeader())
        .when()
            .get("/v2/customers/")
        .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void tentaConsultarTodosOsClientesSemAutenticacaoTest(){
        given()
            .auth()
            .preemptive()
            .basic("token_invalido", "chave_invalida")
            .header("Accept", ContentType.JSON.getAcceptHeader())
        .when()
            .get("/v2/customers/")
        .then()
            .statusCode(401)
            .log().all();
    }
}
