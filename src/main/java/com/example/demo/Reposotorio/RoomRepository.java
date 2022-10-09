/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Reposotorio;

import com.example.demo.Interface.RoomInterface;
import com.example.demo.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class RoomRepository {

    @Autowired
    
    private RoomInterface RoomCrudRepository;
    
    public List<Room> getAll() {
        return (List<Room>) RoomCrudRepository.findAll();
        
    }
    
    public Optional<Room> getRoom(int id) {
        
        return RoomCrudRepository.findById(id);
    }
    
    public Room save(Room room) {
        
        return RoomCrudRepository.save(room);
        
    }

    public void delete(Room room) {
        
        RoomCrudRepository.delete(room);
    }
    
}
