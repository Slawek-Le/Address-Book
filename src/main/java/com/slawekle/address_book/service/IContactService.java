package com.slawekle.address_book.service;

import java.util.List;

import com.slawekle.address_book.Model.Contact;

public interface IContactService {
    Contact addContact(Contact request);
    Contact updateContact(Long id, Contact contact);
    Contact getContact(Long id);
    void deleteContact(Long id);
    List<Contact> getContacts();

}
