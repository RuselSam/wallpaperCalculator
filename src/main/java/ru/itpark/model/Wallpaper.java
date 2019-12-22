package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Wallpaper {

    private double wallpaperLength;
    private double wallpaperWidth;

    public double wallpaperArea (){
        double walArea = wallpaperLength * wallpaperWidth;
        return walArea;
    }
}
