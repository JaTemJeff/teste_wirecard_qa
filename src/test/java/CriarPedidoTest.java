import io.restassured.http.ContentType;
import massa.PedidoMassa;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CriarPedidoTest extends BaseTest{

    PedidoMassa pedidoMassa = new PedidoMassa();

    @Test
    public void criarPedidoValidoComCheckoutWirecardTest(){
        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pedidoMassa.MASSA_CRIAR_PEDIDO_CHECKOUT_WIRECARD)
        .when()
            .post("/v2/orders/")
        .then()
            .assertThat()
            .body("status", equalTo("CREATED"))
            .statusCode(201);
    }

    @Test
    public void criarPedidoValidoComUmNovoClienteTest(){
        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pedidoMassa.MASSA_CRIAR_PEDIDO_COM_NOVO_CLIENTE)
        .when()
            .post("/v2/orders/")
        .then()
            .assertThat()
            .body("status", equalTo("CREATED"))
            .statusCode(201)
            .log().all();
    }

    @Test
    public void criarPedidoValidoComClienteExistenteTest(){
        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pedidoMassa.MASSA_CRIAR_PEDIDO_COM_CLIENTE_EXISTENTE)
        .when()
            .post("/v2/orders/")
        .then()
            .assertThat()
            .body("status", equalTo("CREATED"))
            .statusCode(201);
    }

    @Test
    public void tentaCriarPedidoSemAutenticacaoTest() {
        given()
            .auth()
            .preemptive()
            .basic("token_invalido", "chave_invalida")
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pedidoMassa.MASSA_CRIAR_PEDIDO_COM_CLIENTE_EXISTENTE)
        .when()
            .post("/v2/orders/")
        .then()
            .statusCode(401);
    }

}
