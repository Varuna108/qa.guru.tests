package helpers;

public class Environment {
    public final static String
    yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru"),
    googleUrl = System.getProperty("googleUrl", "https://google.com");
}
