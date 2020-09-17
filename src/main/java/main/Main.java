package main;

import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {

        final String url = "https://swapi.dev/api/planets/";
        System.out.println(new RestTemplate().getForObject(url, String.class));

    }
}
