package com.sda.iManu.service;

import com.sda.iManu.domain.Hotel;

/**
 * Created by RENT on 2016-09-21.
 */
public interface IHotelService {

    boolean addHotel (Hotel hotel);
    void deleteHotel (int hotelId);

}
