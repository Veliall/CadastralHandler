package ru.netology;


public class LandLot {
    private final long id;
    private final int width;
    private final int length;
    private final long recommendedPrice;

    public LandLot(long id, int width, int length, long recommendedPrice) {
        this.id = id;
        this.width = width;
        this.length = length;
        this.recommendedPrice = recommendedPrice;
    }

    public long getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public long getRecommendedPrice() {
        return recommendedPrice;
    }
}
