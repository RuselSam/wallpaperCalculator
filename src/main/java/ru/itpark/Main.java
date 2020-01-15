package ru.itpark;

import ru.itpark.service.WallpaperService;

public class Main {
    public static void main(String[] args) {

        WallpaperService service = new WallpaperService();
        double roomArea = service.addRoom(2.7, 4.5, 3);
        double wallpaperArea = service.addWallpaper(10, 1);

            double numbersOfRoll = roomArea / wallpaperArea;
            double finalNumbersOfRoll = (int) numbersOfRoll;
            if (roomArea % wallpaperArea > 0) {
                finalNumbersOfRoll++;
            }
        System.out.println("Площадь комнаты: "+roomArea);
        System.out.println("Площадь рулона обоев: "+wallpaperArea);
        System.out.println("Количество рулонов: "+finalNumbersOfRoll);


    }
}