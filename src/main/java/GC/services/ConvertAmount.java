package GC.services;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ConvertAmountParams;
import preparaConexao.PreparaConexao;

import java.net.URISyntaxException;

public class ConvertAmount {
    public static void main(String[] args) throws URISyntaxException {

        //Utiliza API e Secret key configurada no arquivo PreparaConexao.
        Client client = PreparaConexao.startConection();

        ConvertAmountParams query = new ConvertAmountParams();
        query.setSource("USD");
        query.setTarget("BRL");
        query.setAmount(100L);

        com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount response = client.merchant("merchantId").services().convertAmount(query);

        System.out.println("Convert: " + query.getSource() + " To: " + query.getTarget());
        System.out.println("Converted value is: " + response.getConvertedAmount());

    }

}
