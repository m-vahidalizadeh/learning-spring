package com.gloriousoft.learningspring.business.service;

import com.gloriousoft.learningspring.business.domain.RoomReservation;
import com.gloriousoft.learningspring.data.repository.GuestRepository;
import com.gloriousoft.learningspring.data.repository.ReservationRepository;
import com.gloriousoft.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationForDate(Date date) {
        return null;
    }
}
