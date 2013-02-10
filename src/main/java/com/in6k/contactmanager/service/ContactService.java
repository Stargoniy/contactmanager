package com.in6k.contactmanager.service;

import com.in6k.contactmanager.domain.Contact;

import java.util.List;

public interface ContactService {
    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}