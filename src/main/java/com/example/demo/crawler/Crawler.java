package com.example.demo.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Crawler {

    public HashSet<String> urls;

    public Crawler(HashSet<String> urls){
        this.urls = urls;
    }

    public void start(){

        Iterator<String> iterator= this.urls.iterator();

        while (iterator.hasNext()){
            String url =iterator.next();
            System.out.println(url);
            try {
                //2. Fetch the HTML code
                Document document = Jsoup.connect(url).get();
                //3. Parse the HTML to extract links to other URLs
                Elements linksOnPage = document.select("a[href]");

                //5. For each extracted URL... this way can be recursive
                for (Element page : linksOnPage) {
                    //getPageLinks(page.attr("abs:href"));
                    System.out.println(page.attr("abs:href"));
                }
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
