package core;

import io.restassured.http.ContentType;

public interface DataUtils {

    GeradorUtils geradorUtils = new GeradorUtils();

    //URL
    String BASE_URL = "https://sandbox.moip.com.br";

    //TOKENS
    String TOKEN = "QGR6CNTUFR6K4YDYS9L32VCJ84UZQAJU";
    String CHAVE = "DITSMTJMQW7OEBFIJC814FUCIQ52VOSLCHF2CUB3";
    String TOKEN_BASE64= "UUdSNkNOVFVGUjZLNFlEWVM5TDMyVkNKODRVWlFBSlU6RElUU01USk1RVzdPRUJGSUpDODE0RlVDSVE1MlZPU0xDSEYyQ1VCMw==";
    String TOKEN_CHAVE = "QGR6CNTUFR6K4YDYS9L32VCJ84UZQAJU:DITSMTJMQW7OEBFIJC814FUCIQ52VOSLCHF2CUB3";
    String CHAVE_JS = "NK4HPJENWTDB4S9KQ39P4U1KIVWWEMUB";
    String PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwaKBFqksfcaKGKwUMB1J\n" +
            "aejY/k3vaANTDu2XUM+EtCK4UfaNsE7jEgdc/WUhKU980hxhpuAWaHPYYkvd46WY\n" +
            "+ZMk4XWpv0zXJj5fSN9V5+w2ZVwZXfvDzQ8JBUep8Ka96tzPnC8cLOuzE7+gIznf\n" +
            "FIMKBV+NFRq+EEhWx36ukIM6tt7UVNa46Htws17gFU/UV2IpYPr15T1ZbzCl+ENr\n" +
            "fmhHohvQVyERohQqQfpvtran1nRmMbPMaE+8n7R/bf3sbp1cpGedBb2n0tU2C1jF\n" +
            "hl1FF/ZZg92BdJako/0d84VA9t9TXZDX4imQUyfcjERRO5+vNnpTFpTQSWDcZjnB\n" +
            "PQIDAQAB\n" +
            "-----END PUBLIC KEY-----\n";

    //CONFIG
    ContentType Content_Type = ContentType.JSON;
    Long MAX_TIMEOUT = 10000L;

}
