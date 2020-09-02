package com.sapient.calculator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class controller_database {
	@Autowired
	private EntryRepository data;

    @GetMapping("/db")
    public List<entry> getAllEntries() {
        return data.findAll();
    }
  
    @PostMapping("/db")
    public entry createEntry(@Validated @RequestBody entry ent) {
        return data.save(ent);
    }
}
