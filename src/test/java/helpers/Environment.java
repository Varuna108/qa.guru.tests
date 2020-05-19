package helpers;

public class Environment {
    public final static String
    yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru"),
    yandexMarketItemName = System.getProperty("yandexMarketItemName", "Iphone 8"),

    googleUrl = System.getProperty("googleUrl", "https://google.com");
}
