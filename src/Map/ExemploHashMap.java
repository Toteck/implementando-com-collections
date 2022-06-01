package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {


    public static void main(String[] args) {

        Map<String, String> brasil = new HashMap<>(){{

            put("Alagoas", "Maceió");
            put("Bahia", "Salvador");
            put("Ceará", "Fortaleza");
            put("Maranhão", "São Luís do Maranhão");
            put("Minas Gerais", "Belo Horizonte");
        }};

        System.out.println(brasil);
        System.out.println("---------------");
        brasil.remove("Minas Gerais");
        System.out.println(brasil);
        System.out.println("---------------");
        brasil.put("Brasília", "Distrito Federal");
        System.out.println("---------------");
        System.out.println(brasil.size());
        System.out.println("---------------");
        for(Map.Entry<String, String> br : brasil.entrySet()){
            System.out.println("Estado - " + br.getKey() + " Capital - " + br.getValue());
        }
        System.out.println("---------------");
        System.out.println(brasil.containsKey("Santa Catarina"));
        System.out.println("---------------");
        System.out.println(brasil.containsKey("Maranhão"));

    }
}
