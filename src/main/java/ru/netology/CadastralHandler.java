package ru.netology;

public class CadastralHandler {

    public boolean validate(long priceForSqrMtr, LandLot lot) {
        return priceForSqrMtr * lot.getWidth() * lot.getLength() >= lot.getRecommendedPrice();
    }
}
