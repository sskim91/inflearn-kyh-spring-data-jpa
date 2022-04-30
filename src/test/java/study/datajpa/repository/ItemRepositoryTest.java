package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.Item;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sskim on 2022/04/30
 * Github : http://github.com/sskim91
 */
@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    void save() throws Exception{
        Item item = new Item("A");
        itemRepository.save(item);
    }
}