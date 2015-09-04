package com.bankonet.report;


public class ReportFactory {

    public static ReportGenerator createReport(String reportType) {
        switch (reportType.trim().toUpperCase()) {
            case "HTML":    return new HtmlReportGenerator();
            case "PDF":     return new PdfReportGenerator();

            default:        throw new IllegalArgumentException();
        }
    }

}
