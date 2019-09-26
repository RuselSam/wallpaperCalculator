import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        double roomLength = scan.nextDouble();
        System.out.print("Enter the height of the room: ");
        double roomHeight = scan.nextDouble();
        double wallpaperWallHeightReserve = 0.1;
        double roomHeightGluingMargin = roomHeight + wallpaperWallHeightReserve;
        System.out.print("Enter the width of the room: ");
        double roomWidth = scan.nextDouble();
        double roomWallArea = (roomLength * 2 + roomWidth * 2) * roomHeightGluingMargin;
        System.out.println("Room wall area: " + roomWallArea);
        System.out.print("Enter the length of the wallpaper: ");
        double wallpaperLength = scan.nextDouble();
        System.out.print("Enter the width of the wallpaper: ");
        double wallpaperWidth = scan.nextDouble();
        double wallpaperArea = wallpaperLength * wallpaperWidth;
        System.out.println("Wallpaper area: " + wallpaperArea);
        double numbersOfRoll = roomWallArea / wallpaperArea;
        int finalNumbersOfRoll = (int) numbersOfRoll;
        if (roomWallArea % wallpaperArea > 0) {
            finalNumbersOfRoll++;
        }
        System.out.println("Numbers of roll: " + finalNumbersOfRoll);

    }
}
