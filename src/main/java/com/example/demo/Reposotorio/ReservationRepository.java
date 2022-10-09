/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Reposotorio;

import com.example.demo.Interface.ReservationInterface;
import com.example.demo.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class ReservationRepository {

    @Autowired

    private ReservationInterface ReservationCrudRepository;

    public List<Reservation> getAll() {
        return (List<Reservation>) ReservationCrudRepository.findAll();

    }

    public Optional<Reservation> getReservation(int id) {

        return ReservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {

        return ReservationCrudRepository.save(reservation);

    }

    public void delete(Reservation reservation) {

        ReservationCrudRepository.delete(reservation);

    }
}
