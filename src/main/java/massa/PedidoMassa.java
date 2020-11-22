package massa;

import core.GeradorUtils;

public class PedidoMassa {
    GeradorUtils geradorUtils = new GeradorUtils();

    public String MASSA_CRIAR_PEDIDO_CHECKOUT_WIRECARD = "{  \n" +
            "   \"ownId\":\""+geradorUtils.numericoAleatorio(44)+"\",\n"+
            "   \"amount\":{  \n" +
            "      \"currency\":\"BRL\",\n" +
            "      \"subtotals\":{  \n" +
            "         \"shipping\":1500\n" +
            "      }\n" +
            "   },\n" +
            "   \"items\":[  \n" +
            "      {  \n" +
            "         \"product\":\""+geradorUtils.stringAleatoria(249)+"\",\n"+
            "         \"category\":\"APPAREL_AND_ACCESSORIES\",\n" +
            "         \"subcategory\":\"CLOTHING\",\n" +
            "         \"quantity\":1,\n" +
            "         \"detail\":\"Camiseta estampada branca\",\n" +
            "         \"price\":9500\n" +
            "      }\n" +
            "   ],\n" +
            "   \"customer\":{  \n" +
            "      \"id\":\"CUS-BV9AK0HS9IOR\"\n" +
            "   },\n" +
            "   \"checkoutPreferences\":{  \n" +
            "      \"redirectUrls\":{  \n" +
            "         \"urlSuccess\": \"http://www.lojaexemplo.com.br/compraFeita\",\n" +
            "         \"urlFailure\": \"http://www.lojaexemplo.com.br/error\"\n" +
            "      },\n" +
            "      \"installments\":[  \n" +
            "         {  \n" +
            "            \"quantity\":[1,6]\n" +
            "         }\n" +
            "      ]\n" +
            "   }\n" +
            "}";

    public String MASSA_CRIAR_PEDIDO_COM_NOVO_CLIENTE = "{\n" +
            "   \"ownId\":\""+geradorUtils.numericoAleatorio(44)+"\",\n"+
            "  \"amount\": {\n" +
            "    \"currency\": \"BRL\",\n" +
            "    \"subtotals\": {\n" +
            "      \"shipping\": 1500\n" +
            "    }\n" +
            "  },\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"product\": \"Câmera fotográfica\",\n" +
            "      \"category\": \"CAMERAS\",\n" +
            "      \"quantity\": 1,\n" +
            "      \"detail\": \"Câmera fotográfica, modelo CM54296, cor preta\",\n" +
            "      \"price\": 100000\n" +
            "    }\n" +
            "  ],\n" +
            "  \"customer\": {\n" +
            "    \"ownId\": \""+geradorUtils.stringAleatoria(44)+"\",\n"+
            "    \"fullname\": \""+geradorUtils.stringAleatoria(20)+"\",\n"+
            "    \"email\": \"rafael@email.com\",\n" +
            "    \"birthDate\": \"1980-05-15\",\n" +
            "    \"taxDocument\": {\n" +
            "      \"type\": \"CPF\",\n" +
            "      \"number\":\""+geradorUtils.gerarCPF()+"\""+
            "    },\n" +
            "    \"phone\": {\n" +
            "      \"countryCode\": \"55\",\n" +
            "      \"areaCode\": \"11\",\n" +
            "      \"number\": \"88763546\"\n" +
            "    },\n" +
            "    \"shippingAddress\": {\n" +
            "      \"street\": \"Avenida Brigadeiro Faria Lima\",\n" +
            "      \"streetNumber\": 123,\n" +
            "      \"complement\": 321,\n" +
            "      \"district\": \"Jardim Paulistano\",\n" +
            "      \"city\": \"Sao Paulo\",\n" +
            "      \"state\": \"SP\",\n" +
            "      \"country\": \"BRA\",\n" +
            "      \"zipCode\": \"01451000\"\n" +
            "    }\n" +
            "  }\n" +
            "}";

    public String MASSA_CRIAR_PEDIDO_COM_CLIENTE_EXISTENTE = "{\n" +
            "    \"ownId\": \""+geradorUtils.numericoAleatorio(44)+"\",\n"+
            "  \"amount\": {\n" +
            "    \"currency\": \"BRL\",\n" +
            "    \"subtotals\": {\n" +
            "      \"shipping\": 1500\n" +
            "    }\n" +
            "  },\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"product\": \"Câmera fotográfica\",\n" +
            "      \"category\": \"CAMERAS\",\n" +
            "      \"quantity\": 1,\n" +
            "      \"detail\": \"Câmera fotográfica, modelo CM54296, cor preta\",\n" +
            "      \"price\": 100000\n" +
            "    }\n" +
            "  ],\n" +
            "  \"customer\": {\n" +
            "    \"id\": \"CUS-BV9AK0HS9IOR\"\n" +
            "  }\n" +
            "}";
}
