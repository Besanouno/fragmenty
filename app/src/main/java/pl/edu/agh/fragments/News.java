package pl.edu.agh.fragments;

import java.util.LinkedHashMap;
import java.util.Map;

public class News {
    private Map<String, String> news = new LinkedHashMap<>();

    private static News instance = null;

    public static News getInstance() {
        if (instance == null) {
            synchronized (News.class) {
                if (instance == null) {
                    instance = new News();
                }
            }
        }
        return instance;
    }

    private News() {
        news.put("Andrzej Duda udziela Wietnamczykom 250 milionów euro pożyczki...", "Widać, że Andrzej Duda w podróżach dyplomatycznych ceni sobie raczej niepopularne kierunki i kontynenty: w maju odwiedził między innymi Etiopię, gdzie zwiedzał fabrykę maszyn rolniczych.");
        news.put("Wiemy kto wygrał Azja Express", "Emocje w Azja Express sięgnęły zenitu. W finałowym odcinku zostały trzy pary, w tym tylko jedna kobieta, Marta Wierzbicka, która zmuszona okolicznościami i regulaminem stworzyła całkiem udaną parę ze Staszkiem Karpielem-Bułecką. Na metę przy Kala Ghoda jako pierwsi przybyli Antoni Pawlicki i Paweł Ławrynowicz.");
        news.put("Przejęta Kendall Jenner z ręką w getrach", "Obmyślona przez Kris Jenner strategia rozdzielania medialnych \"specjalizacji\" pomiędzy córki przynosi oszałamiające rezultaty. 20-letnia Kylie zarabia miliony na sprzedaży kosmetyków, Khloe promuje się na ekspertkę od fitnessu, a Kendall robi karierę w świecie mody.");
        news.put("Ogórek z portfelem za 2.5 tys zł kupuje lunch", "Jeszcze kilka lat temu Magdalena Ogórek w przestrzeni publicznej funkcjonowała dzięki sporadycznym wizytom w Dzień Dobry TVN, gdzie występowała jako historyk kościoła. Niedawno w przerwie od pracy w telewizji udała się na krótką przerwę, by kupić jedzenie na wynos. Wychodząc z luksusowego BMW chętnie eksponowała portfel od Louis Vuitton za prawie 2,5 tysiąca złotych.");
        news.put("Moda na białe kozaczki dopadła Anetę Kręglicką", "Aneta Kręglicka wśród wielu kobiet uchodzi za \"ikonę\" stylu, słynąc z wyważonego podejścia do trendów. Miss Świata z 1989 roku regularnie chwali się modowym wyczuciem na \"prestiżowych\" ściankach, co zapewniło jej nawet status \"ambasadorki\" i \"projektantki\" obuwniczej marki Badura.");
        news.put("Brat Paris Hilton kąpie się w ubraniach", "Barron od lat nie wdaje się w konflikty z prawem i stroni od skandali. W tym miesiącu postanowił wyjść z cienia słynnych sióstr, występując w modowej sesji. Zdjęcia do magazynu MMScene wykonał Matthew Lyn, przedstawiając dziedzica w dorosłym wydaniu. Na potrzeby sesji Barron pozował w klasycznych stylizacjach od Paula Smitha, Isseya Miyake i Johna Varvatosa. Wzrok przykuwa ujęcie, na którym 28-latek kąpie się w garniturze.");
    }

    public String[] getTitles() {
        return news.keySet().toArray(new String[news.size()]);
    }

    public String getContent(String title) {
        return news.get(title);
    }
}
