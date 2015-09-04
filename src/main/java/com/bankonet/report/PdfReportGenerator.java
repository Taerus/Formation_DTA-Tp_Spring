package com.bankonet.report;


public class PdfReportGenerator extends ReportGenerator {

    @Override
    public void generate() {
        System.out.println("G�n�ration d'un rapport PDF...");
    }

    @Override
    public void generate(String author) {
        this.generate();
        System.out.println("-> Auteur : " + author);
    }

}
