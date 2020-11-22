import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ConsultarTodosOsPedidosTest extends BaseTest{
    @Test
    public void consultaTodosOsPedidosTest(){
        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
        .when()
            .get("/v2/orders/")
        .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void tentaConsultarTodosOsPedidosSemAutenticacaoTest(){
        given()
            .auth()
            .preemptive()
            .basic("token_invalido", "chave_invalida")
            .header("Accept", ContentType.JSON.getAcceptHeader())
        .when()
            .get("/v2/orders/")
        .then()
            .statusCode(401);
    }
}
