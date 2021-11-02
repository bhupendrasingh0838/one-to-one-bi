package mapping.onetoonebi.Service;

import mapping.onetoonebi.Entity.Items;
import mapping.onetoonebi.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    public List<Items> getAll(){
        return (List<Items>) itemRepository.findAll();
    }
    public Items getById(int id){
        return  itemRepository.findById(id).get();
    }
    public void create(Items items){
        itemRepository.save(items);
    }
    public void delete(int id){
        itemRepository.deleteById(id);
    }
    public Items update(int id ,Items items){
        Items items1=itemRepository.findById(id).get();
        items1.setItemName1(items.getItemName1());
        items1.setItemName2(items.getItemName2());
        itemRepository.save(items1);
        return  items1;
    }
}
