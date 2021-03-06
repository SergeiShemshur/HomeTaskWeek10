package org.geekhub;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String FOLDER_TO_DOWNLOAD = "/home/sergei/picture/";

    public static void main(String[] args) throws IOException {
        ImageCrawler imageCrawler = new ImageCrawler(FOLDER_TO_DOWNLOAD);
        imageCrawler.downloadImages("http://trinixy.ru/16356-prikolnye_kartinki_ochen_mnogo.html");

        System.out.println("While it's loading you can enter another url to start download images:");

        Scanner scanner = new Scanner(System.in);
        String command;
        while(!"exit".equals(command = scanner.next())) {
            System.out.println(command);
            imageCrawler.downloadImages(command);

            System.out.println("...and another url:");
        }
        System.out.println("exit go");
        imageCrawler.stop();
    }
}
