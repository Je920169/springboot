package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.dto.BookingMeetingRoomDto;
import com.example.demo.model.po.BookingMeetingRoom;

public interface BookingDao extends RoomDao {
	
	Integer addBooking(BookingMeetingRoom bookingMeetingRoom);
	
	Integer cancelBooking(Integer bookingId);
	
	List<BookingMeetingRoomDto>findAllBookings();
	
	Integer updateBookingUserId(Integer bookingId, Integer userId);
}
