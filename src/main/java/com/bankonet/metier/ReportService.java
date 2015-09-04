package com.bankonet.metier;


import com.bankonet.report.IReportGenerator;


public class ReportService {

    private IReportGenerator reportGenerator;

    public ReportService() {}

    public ReportService(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generate();
    }

    public void setReportGenerator(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
}
