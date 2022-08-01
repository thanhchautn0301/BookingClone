package com.booking.helpers;


import com.booking.entities.RoomType;

import java.util.Arrays;
import java.util.List;

public class Util {

    public static RoomType GetRoomType(String category){
        try {
            if(category != null){
                String[] part = category.split("-");
                String adult = part[0].trim().substring(0,1);
                String child = part[1].trim().substring(0,1);

                RoomType roomType = new RoomType();
                roomType.setQuantityAdult(Integer.parseInt(adult));
                roomType.setQuantityChildren(Integer.parseInt(child));
                return roomType;
            }
            return null;
        }catch (Exception e){
         return null;
        }
    }

    public static List<String> getDate(String dateRange){
        if(dateRange != ""){
            List<String> dates = Arrays.asList(dateRange.split("to"));
            return dates;
        }
        return null;
    }



}
