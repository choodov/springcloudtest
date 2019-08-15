package com.wonderstudy.cloud.reservation;

import com.wonderstudy.cloud.reservation.client.RoomService;
import com.wonderstudy.cloud.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomReservationController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms() {
        return roomService.findAll(null);
    }

}
