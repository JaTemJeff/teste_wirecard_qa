package massa;

import core.GeradorUtils;

import static core.DataUtils.*;

public class PagamentoMassa {
    GeradorUtils geradorUtils = new GeradorUtils();

    public String MASSA_PAGAMENTO_CARTAO_DE_CREDITO_CRIPTOGRAFADO = "{  \n" +
            "   \"installmentCount\":6,\n" +
            "   \"statementDescriptor\":\"Minha Loja\",\n" +
            "   \"fundingInstrument\":{  \n" +
            "      \"method\":\"CREDIT_CARD\",\n" +
            "      \"creditCard\":{  \n" +
            "         \"hash\": \"HhL0kbhfid+jwgj5l6Kt9EPdetDxQN8s7uKUHDYxDC/XoULjzik44rSda3EcWuOcL17Eb8JjWc1JI7gsuwg9P0rJv1mJQx+d3Dv1puQYz1iRjEWWhnB1bw0gTvnnC/05KbWN5M8oTiugmhVK02Rt2gpbcTtpS7VWyacfgesBJFavYYMljYg8p2YGHXkXrMuQiOCeemKLk420d0OTMBba27jDVVJ663HZDrObnjFXJH/4B5irkj+HO5genV+V4PYoLcOESG4nrI3oFAsMGsLLcdJo0NNvkEmJpn0e9GzureKKFYisYU+BEd9EMr/odS0VMvOYRV65HbPTspIkjl2+3Q==\",\n" +
            "         \"store\":true,\n" +
            "         \"holder\":{  \n" +
            "            \"fullname\":\"Roberto Oliveira\",\n" +
            "            \"birthdate\":\"1988-12-30\",\n" +
            "            \"taxDocument\":{  \n" +
            "               \"type\":\"CPF\",\n" +
            "               \"number\":\"78994193600\"\n" +
            "            },\n" +
            "            \"phone\":{  \n" +
            "               \"countryCode\":\"55\",\n" +
            "               \"areaCode\":\"11\",\n" +
            "               \"number\":\"22849560\"\n" +
            "            },\n" +
            "            \"billingAddress\":{  \n" +
            "               \"city\":\"Belo Horizonte\",\n" +
            "               \"district\":\"Savassi\",\n" +
            "               \"street\":\"Avenida Contorno\",\n" +
            "               \"streetNumber\":\"400\",\n" +
            "               \"zipCode\":\"76932800\",\n" +
            "               \"state\":\"MG\",\n" +
            "               \"country\":\"BRA\"\n" +
            "            }\n" +
            "         }\n" +
            "      }\n" +
            "   },\n" +
            "   \"device\":{  \n" +
            "      \"ip\":\"127.0.0.1\",\n" +
            "      \"geolocation\":{  \n" +
            "         \"latitude\":-33.867,\n" +
            "         \"longitude\":151.206\n" +
            "      },\n" +
            "      \"userAgent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36\",\n" +
            "      \"fingerprint\":\"QAZXswedCVGrtgBNHyujMKIkolpQAZXswedCVGrtgBNHyujMKIkolpQAZXswedCVGrtgBNHyujMKIkolpQAZXswedCVGrtgBNHyujMKIkolp\"\n" +
            "   }\n" +
            "}";

    public String MASSA_PAGAMENTO_BOLETO = "{  \n" +
            "   \"statementDescriptor\":\"Minha Loja\",\n" +
            "   \"fundingInstrument\":{  \n" +
            "      \"method\":\"BOLETO\",\n" +
            "      \"boleto\":{  \n" +
            "         \"expirationDate\":\"2020-12-30\",\n" +
            "         \"instructionLines\":{  \n" +
            "            \"first\":\"Atenção,\",\n" +
            "            \"second\":\"fique atento à data de vencimento do boleto.\",\n" +
            "            \"third\":\"Pague em qualquer casa lotérica.\"\n" +
            "         },\n" +
            "         \"logoUri\":\"http://www.lojaexemplo.com.br/logo.jpg\"\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public String MASSA_PAGAMENTO_PRE_AUTORIZADO = "{  \n" +
            "   \"installmentCount\":3,\n" +
            "   \"delayCapture\":true,\n" +
            "   \"statementDescriptor\":\"Minha Loja\",\n" +
            "   \"fundingInstrument\":{  \n" +
            "      \"method\":\"CREDIT_CARD\",\n" +
            "      \"creditCard\":{  \n" +
            " \"hash\":\""+TOKEN_BASE64+"\",\n" +
            "         \"store\":true,\n" +
            "         \"holder\":{  \n" +
            "            \"fullname\":\"Roberto Oliveira\",\n" +
            "            \"birthdate\":\"1988-12-30\",\n" +
            "            \"taxDocument\":{  \n" +
            "               \"type\":\"CPF\",\n" +
            "               \"number\":\"78994193600\"\n" +
            "            },\n" +
            "            \"phone\":{  \n" +
            "               \"countryCode\":\"55\",\n" +
            "               \"areaCode\":\"11\",\n" +
            "               \"number\":\"22849560\"\n" +
            "            },\n" +
            "            \"billingAddress\":{  \n" +
            "               \"city\":\"Belo Horizonte\",\n" +
            "               \"district\":\"Savassi\",\n" +
            "               \"street\":\"Avenida Contorno\",\n" +
            "               \"streetNumber\":\"400\",\n" +
            "               \"zipCode\":\"76932800\",\n" +
            "               \"state\":\"MG\",\n" +
            "               \"country\":\"BRA\"\n" +
            "            }\n" +
            "         }\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public String MASSA_PAGAMENTO_POR_CRC_CODE = "{  \n" +
            "   \"installmentCount\":6,\n" +
            "   \"statementDescriptor\":\"my-store.com\",\n" +
            "   \"fundingInstrument\":{  \n" +
            "      \"method\":\"CREDIT_CARD\",\n" +
            "      \"creditCard\":{  \n" +
            "         \"id\": \"CRC-123ABC456DEF\",\n" +
            "         \"cvc\":123\n" +
            "      }\n" +
            "   }\n" +
            "}";

    public String MASSA_PAGAMENTO_DEBITO_ONLINE = "{  \n" +
            "   \"fundingInstrument\":{  \n" +
            "      \"method\":\"ONLINE_BANK_DEBIT\",\n" +
            "      \"onlineBankDebit\":{  \n" +
            "         \"bankNumber\":341,\n" +
            "         \"expirationDate\":\"2020-12-30\"\n" +
            "      }\n" +
            "   }\n" +
            "}";
}
