package com.example.demo;

import com.example.demo.data.ItemRepository;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication  {




    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }


}
