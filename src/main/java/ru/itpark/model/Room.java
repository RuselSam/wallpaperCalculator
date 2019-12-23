package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    private double roomHeight;
    private double roomLength;
    private double roomWidth;
    final static double wallpaperWallHeightReserve = 0.1;
    private final double roomHeightGluingMargin = roomHeight + wallpaperWallHeightReserve;

    public double roomWallArea() {
        double roomWallAreaResult = (roomLength * 2 + roomWidth * 2) * roomHeightGluingMargin;
        return roomWallAreaResult;
    }
}