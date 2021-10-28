package br.exemple.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FornecedorApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(FornecedorApplicationMain.class, args);
    }
}
