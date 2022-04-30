package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Item;

/**
 * Created by sskim on 2022/04/30
 * Github : http://github.com/sskim91
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
