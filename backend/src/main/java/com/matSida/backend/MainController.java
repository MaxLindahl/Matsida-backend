package com.matsida.backend;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller // This means that this class is a Controller
@RequestMapping(path="/sql") // This means URL's start with /sql (after Application path)
public class MainController {
    @Autowired // This means to get the bean called f userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private sold_itemsRepository sold_itemsRepository;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String user
            , @RequestParam String item, @RequestParam String sell_date, @RequestParam String bad_date) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        sold_items n = new sold_items();
        n.setUser(user);
        n.setItem(item);
        n.setSellDate(Date.valueOf(sell_date));
        n.setBadDate(Date.valueOf(bad_date));
        sold_itemsRepository.save(n);
        return "Saved";
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path="/getItemsFrom")
    public @ResponseBody JSONObject getItemsFromUser(@RequestParam String user){
        List<sold_items> itemList = sold_itemsRepository.getItemsByUser(user);
        JSONObject jo = new JSONObject();
        jo.appendField("Items", itemList);
        return jo;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path="/all")
    public @ResponseBody Iterable<sold_items> getAllSoldItems() {
        // This returns a JSON or XML with the users
        return sold_itemsRepository.findAll();
    }
}