package com.sda.buildier;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;


public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");


        //builder


        //all args constructor
        Document document = new Document("Day plan", "Description of the training day", Instant.now(),
                "Maciej Madej", Arrays.asList("pen", "notebook", "laptop"));

        //setters

        Document documentBySetters = new Document();
        documentBySetters.setTitle("Weekly plan");
        documentBySetters.setDescription("Description of the weekly planning");
        documentBySetters.setAuthor("Maciej Madejos");
        documentBySetters.setCreationDate(Instant.now());
        documentBySetters.setItems(Arrays.asList("pencil", "screen", "server"));

//        //builder
//        Document documentByBuilder = Document.builder()
//                .title("Monthly report")
//                .description("KPI and SLA")
//                .creationDate(Instant.now())
//                .author("Maciej Madej")
////    not needed with method item --> .items(Arrays.asList("KPI", "SLA", "IM"))
//                .item("condor")
//                .item("GMP SP")
//                .build();

        //normal way to change one value, author for example
//        new Document(documentByBuilder.getTitle(), documentByBuilder.getDescription(), documentByBuilder.getCreationDate(), documentByBuilder.getAuthor(), documentByBuilder.getItems());

//        Document andrzej_madej = Document.builder(documentByBuilder)
//                .author("Andrzej Madej")
//                .build();

//        DocumentLombok.builder()
//                .author("Maciejos Madejos")
//                .description("Master Plan")
//                .build();

        List<String> items = Arrays.asList("lol", "trol", "heheszki");
        String result = "";
        for (String item : items) {
            result += item + ' ';

        }
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();

        for (String item : items) {
            stringBuilder.append(item).append(" ");
        }
        String message = stringBuilder.toString();
        System.out.println(message);

    }


}
