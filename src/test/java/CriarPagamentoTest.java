import io.restassured.http.ContentType;
import massa.PagamentoMassa;
import massa.PedidoMassa;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CriarPagamentoTest extends BaseTest{

    PagamentoMassa pagamentoMassa = new PagamentoMassa();
    PedidoMassa pedidoMassa = new PedidoMassa();


    public String criaNovoPedido(){
        //Criar pedido novo para realizar o pagamento
        String order_id = given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pedidoMassa.MASSA_CRIAR_PEDIDO_COM_NOVO_CLIENTE)
        .when()
            .post("/v2/orders/")
        .then()
            .extract()
            .path("id");

        return order_id;
    }

    @Test
    public void criarPagamentoCartaoDeCreditoCriptografadoTest(){
        String order_id = criaNovoPedido();

        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pagamentoMassa.MASSA_PAGAMENTO_CARTAO_DE_CREDITO_CRIPTOGRAFADO)
        .when()
            .post("/v2/orders/"+order_id+"/payments")
        .then()
            .statusCode(201);
    }

    @Test
    public void criarPagamentoBoletoTest(){
        String order_id = criaNovoPedido();

        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pagamentoMassa.MASSA_PAGAMENTO_BOLETO)
        .when()
            .post("/v2/orders/"+order_id+"/payments")
        .then()
            .assertThat()
            .body("fundingInstrument.method", equalTo("BOLETO"))
            .statusCode(201)
        .log().all();
    }

    @Test
    public void criarPagamentoPreAutorizadoTest(){
        String order_id = criaNovoPedido();

        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pagamentoMassa.MASSA_PAGAMENTO_PRE_AUTORIZADO)
        .when()
            .post("/v2/orders/"+order_id+"/payments")
        .then()
            .statusCode(201);
    }

    @Test
    public void criarUmPagamentoComCRCcodeTest(){
        String order_id = criaNovoPedido();

        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pagamentoMassa.MASSA_PAGAMENTO_POR_CRC_CODE)
        .when()
            .post("/v2/orders/"+order_id+"/payments")
        .then()
            .statusCode(201);
    }

    @Test
    public void criarUmPagamentoDebitoOnlineTest(){
        String order_id = criaNovoPedido();

        given()
            .auth()
            .preemptive()
            .basic(TOKEN, CHAVE)
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .body(pagamentoMassa.MASSA_PAGAMENTO_DEBITO_ONLINE)
        .when()
            .post("/v2/orders/"+order_id+"/payments")
        .then()
            .assertThat()
            .body("fundingInstrument.method", equalTo("ONLINE_BANK_DEBIT"))
            .statusCode(201);
    }
}
