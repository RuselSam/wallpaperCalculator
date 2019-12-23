package ru.itpark;

import ru.itpark.model.Room;
import ru.itpark.service.WallpaperService;

public class Main {
    public static void main(String[] args) {

        WallpaperService service = new WallpaperService();
        service.addRoom(2.5, 6.6, 5);
        service.addWallpaper(10, 1);
        double s = service.numbersOfRoll();
        System.out.println(s);


    }
}