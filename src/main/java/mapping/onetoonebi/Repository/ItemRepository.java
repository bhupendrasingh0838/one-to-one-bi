package mapping.onetoonebi.Repository;

import mapping.onetoonebi.Entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Items,Integer> {
}
