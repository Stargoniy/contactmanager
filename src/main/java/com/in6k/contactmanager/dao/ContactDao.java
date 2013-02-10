package com.in6k.contactmanager.dao;

import com.in6k.contactmanager.domain.Contact;

import java.util.List;

public interface ContactDao {
    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
