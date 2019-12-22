package ru.itpark;

import ru.itpark.model.Room;
import ru.itpark.service.WallpaperService;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2,4,5.5,);
        WallpaperService wallpaperService = new WallpaperService();
        wallpaperService.numbersOfRoll();
        System.out.println(wallpaperService);
    }

}
