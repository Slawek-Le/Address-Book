package com.slawekle.address_book.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slawekle.address_book.Model.Contact;
import com.slawekle.address_book.service.IContactService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/contacts")
@RequiredArgsConstructor
public class ContractController {
    private final IContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts(){
        return ResponseEntity.ok(contactService.getContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> addContact(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContact(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@RequestBody Contact contact,@PathVariable Long id){
        return ResponseEntity.ok(contactService.updateContact(id,contact));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
        return ResponseEntity.ok("Contact deleted sucessfully!");
    }

    @PostMapping
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
        return ResponseEntity.ok(contactService.addContact(contact));
    }
}
