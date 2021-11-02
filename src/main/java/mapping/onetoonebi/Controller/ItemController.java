package mapping.onetoonebi.Controller;

import mapping.onetoonebi.Entity.Items;
import mapping.onetoonebi.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/getAllItem")
    public List<Items> getAll() {
        return itemService.getAll();
    }

    @GetMapping("/getByIdItem/{id}")
    public Items getById(@PathVariable int id) {
        return itemService.getById(id);
    }

    @PostMapping("/createItem")
    public String create(@RequestBody Items items) {
        itemService.create(items);
        return "Data Created";
    }

    @DeleteMapping("/deleteItem/{id}")
    public String delete(@PathVariable int id) {
        itemService.delete(id);
        return "Data Deleted";
    }

    @PutMapping("/updateItem/{id}")
    public Items update(@PathVariable int id, @RequestBody Items items) {
        itemService.update(id, items);
        return items;
    }


}
