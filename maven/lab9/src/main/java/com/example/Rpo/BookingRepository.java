package com.example.Rpo;
import com.example.Model.BookingModel;
import java.util.ArrayList;
import java.util.List;
public class BookingRepository {
    List<BookingModel> bookingModelList = new ArrayList<BookingModel>();
    public void addBooking(BookingModel bookingModel){
        bookingModel.add(bookingModel);
        System.out.println("Saved booking :" + bookingModel);
    }
}
