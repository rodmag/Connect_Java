package wopa.payments;

import com.google.gson.Gson;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.capture.CapturesResponse;
import GC.services.PreparaConexao;

public class GetCapturesPayment {

    public static void main(String[] args) {

        //Utiliza API e Secret key configurada no arquivo PreparaConexao.
        Client client = PreparaConexao.startConection();

        CapturesResponse response = client.merchant("merchantId").payments().captures("10252149613");

        Gson gson = new Gson();

        System.out.println("Resposta do Get Captures Payment: " + gson.toJson(response));

    }

}
