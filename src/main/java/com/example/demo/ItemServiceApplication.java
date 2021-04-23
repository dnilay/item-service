package com.example.demo;

import com.example.demo.data.ItemRepository;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication implements CommandLineRunner {
private ItemRepository itemRepository;

@Autowired
    public ItemServiceApplication(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    itemRepository.save(new Item(1001,"Item1",100,10));
        itemRepository.save(new Item(1002,"Item2",101,11));
        itemRepository.save(new Item(1001,"Item3",102,12));
    }
}
