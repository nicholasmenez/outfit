

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the network between supernetwork or adumbrella");
        System.out.print("Selection: ");
        String userInput = input.nextLine();

        String date = "";
        if (userInput.equals("supernetwork")) {
            System.out.println("Choose the month and date on the MM-DD format");
            System.out.print("Date: ");
            date = input.nextLine();
        }
        if (date.equals("09-15")) {
            URL adnetwork = new URL("https://storage.googleapis.com/expertise-test/supernetwork/report/daily/2017-09-15.csv");

            URLConnection yc = adnetwork.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            try {
                System.out.println("Daily Report");

            } catch (Exception e) {
                System.out.println(e);
            }

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } else if (date.equals("09-16")) {
            URL adnetwork = new URL("https://storage.googleapis.com/expertise-test/supernetwork/report/daily/2017-09-16.csv");

            URLConnection yc = adnetwork.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            try {
                System.out.println("daily_report");

            } catch (Exception e) {
                System.out.println(e);
            }

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

        } else if (userInput.equals("adumbrella")){
            System.out.println("Choose the month and date on the MM-DD format");
            System.out.print("Date: ");
            date = input.nextLine();
             if(date.equals("09-15")) {
                URL adnetwork = new URL("https://storage.googleapis.com/expertise-test/reporting/adumbrella/adumbrella-15_9_2017.csv");

                URLConnection yc = adnetwork.openConnection();

                BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

                String inputLine;
                try {
                    System.out.println("Daily Report");

                } catch (Exception e) {
                    System.out.println(e);
                }

                while ((inputLine = in.readLine()) != null)
                    System.out.println(inputLine);
                in.close();
            } else if (date.equals("09-16")) {
                URL adnetwork = new URL("https://storage.googleapis.com/expertise-test/reporting/adumbrella/adumbrella-16_9_2017.csv");

                URLConnection yc = adnetwork.openConnection();

                BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

                String inputLine;
                try {
                    System.out.println("daily_report");

                } catch (Exception e) {
                    System.out.println(e);
                }

                while ((inputLine = in.readLine()) != null)
                    System.out.println(inputLine);
                in.close();
        }
    }
}}





