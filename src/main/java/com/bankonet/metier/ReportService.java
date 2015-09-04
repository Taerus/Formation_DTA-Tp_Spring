package com.bankonet.metier;


import com.bankonet.report.IReportGenerator;


public class ReportService {

    private IReportGenerator reportGenerator;
    private String author;

    public ReportService() {}

    public ReportService(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generate(author);
    }

    public void setReportGenerator(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
