package com.example.demo02_web.Controller;

import com.example.demo02_web.bean.Person;
import com.example.demo02_web.bean.Pet;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-02 23:04
 **/
@RestController
public class ParameterTest {
    @GetMapping("/car/{id}/owner/{money}")
    public HashMap<Object, Object> text01(@PathVariable("id") Integer id,
                                          @PathVariable("money") Integer money,
                                          @PathVariable Map<String,String> pv){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("money",money);
        map.put("pv",pv);
        return map;
    }

    @PostMapping("/saveuser")
    public Person saveuser(Person person){
        return person;
    }
}
