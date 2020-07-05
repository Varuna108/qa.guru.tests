package helpers;

public class Environment {
    public final static String
        selenoid_url = System.getProperty("selenoid_url"),
        yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru"),
        googleUrl = System.getProperty("googleUrl", "https://google.com");
    public final static char []
            passwordZipFile = {'q', 'w', 'e', 'r', 't', 'y'};
}
