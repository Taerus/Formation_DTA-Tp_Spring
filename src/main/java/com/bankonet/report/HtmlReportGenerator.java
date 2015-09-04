package com.bankonet.report;


public class HtmlReportGenerator implements IReportGenerator {

    @Override
    public void generate() {
        System.out.println("Génération d'un rapport HTML...");
    }

    @Override
    public void generate(String author) {
        this.generate();
        System.out.println("-> Auteur : " + author);
    }
}
