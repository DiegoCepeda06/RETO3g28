/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Reposotorio;

import com.example.demo.Interface.MessageInterface;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class MessageRepository {

    @Autowired
    private MessageInterface MessageCrudRepository;

    public List<Message> getAll() {
        return (List<Message>) MessageCrudRepository.findAll();

    }

    public Optional<Message> getMessage(int id) {

        return MessageCrudRepository.findById(id);
    }

    public Message save(Message message) {

        return MessageCrudRepository.save(message);

    }

    public void delete(Message message) {
        MessageCrudRepository.delete(message);
    }

}
