package ru.itpark.service;

import ru.itpark.model.Room;
import ru.itpark.model.Wallpaper;

public class WallpaperService{

        Room room = new Room();
        Wallpaper wallpaper = new Wallpaper();

        public double numbersOfRoll () {
            double numb = room.roomWallArea() / wallpaper.wallpaperArea();
            double finalNumbersOfRoll = (int) numb;
            if (room.roomWallArea() % wallpaper.wallpaperArea() > 0) {
                finalNumbersOfRoll++;
            } else {
                return finalNumbersOfRoll;
            }
            return finalNumbersOfRoll;
        }

}
