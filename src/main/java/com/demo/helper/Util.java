package com.demo.helper;

import com.demo.entities.RoomType;

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
}
