package com.slawekle.address_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slawekle.address_book.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    
} 

