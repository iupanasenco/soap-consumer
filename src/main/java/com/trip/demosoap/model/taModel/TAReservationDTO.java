package com.trip.demosoap.model.taModel;

import com.trip.demosoap.model.OTAHotelResNotifRQ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class TAReservationDTO {

    private Guest guest;
    private Booking booking;

    public TAReservationDTO fromOTAHotelResNotifRQ (OTAHotelResNotifRQ reservationNotifRQ) {
        Guest guest = new Guest();
        Booking booking = new Booking();



        TAReservationDTO taReservationDTO = new TAReservationDTO(guest, booking);
        return taReservationDTO;
    }

}
