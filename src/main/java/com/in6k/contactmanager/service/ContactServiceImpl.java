package com.in6k.contactmanager.service;

import com.in6k.contactmanager.dao.ContactDao;
import com.in6k.contactmanager.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Transactional
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {
        return contactDao.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDao.removeContact(id);
    }
}