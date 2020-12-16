package com.trip.demosoap.client;

import com.trip.demosoap.loanEligibility.Acknowledgement;
import com.trip.demosoap.loanEligibility.CustomerRequest;
import com.trip.demosoap.model.OTAHotelResNotifRQ;
import com.trip.demosoap.model.OTAHotelResNotifRS;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate webServiceTemplate;

    public SoapClient(Jaxb2Marshaller marshaller) {
        this.marshaller = marshaller;
    }


    public Acknowledgement getNotification (CustomerRequest request) {
        webServiceTemplate = new WebServiceTemplate(marshaller);
        Acknowledgement acknowledgement = (Acknowledgement) webServiceTemplate.marshalSendAndReceive("http://localhost:9090/ws",
                request);
        return acknowledgement;
    }

    public OTAHotelResNotifRS validateHotelReservation (OTAHotelResNotifRQ request) {
        System.out.println(request.getEchoToken());

        webServiceTemplate = new WebServiceTemplate(marshaller);

        OTAHotelResNotifRS otaHotelResNotifRS = (OTAHotelResNotifRS)
                webServiceTemplate.marshalSendAndReceive("http://localhost:9090/ws", request);

//                        "https://api.tripadvisor.com/api/partner/1.0/post_reservation_siteminder?key=261A9BE4CD224EDE89572895EDFED980",otaHotelResNotifRQ);
        return otaHotelResNotifRS;
    }



}
