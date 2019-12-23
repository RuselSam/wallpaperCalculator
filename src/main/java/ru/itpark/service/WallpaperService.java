package ru.itpark.service;

import ru.itpark.model.Room;
import ru.itpark.model.Wallpaper;

public class WallpaperService{
        public double addRoom(double height, double length, double width) {
            Room room = new Room();
            room.setRoomHeight(height);
            room.setRoomLength(length);
            room.setRoomWidth(width);
            return room.roomWallArea();
            }

            public double addWallpaper(double length, double width) {
                Wallpaper wallpaper = new Wallpaper();
                wallpaper.setWallpaperLength(length);
                wallpaper.setWallpaperWidth(width);
                return wallpaper.wallpaperArea();
            }

        public double numbersOfRoll () {
            double numb = addRoom() / addWallpaper();
            double finalNumbersOfRoll = (int) numb;
            if (addRoom() % addWallpaper() > 0) {
                finalNumbersOfRoll++;
            } else {
                return finalNumbersOfRoll;
            }
            return finalNumbersOfRoll;
        }

}
