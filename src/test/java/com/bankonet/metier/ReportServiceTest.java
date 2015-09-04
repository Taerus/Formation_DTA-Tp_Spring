package com.bankonet.metier;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReportServiceTest {

    @Test
    public void testGenerateReport() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // get report service beans
        ReportService reportService1 = (ReportService) context.getBean("reportService");
        ReportService reportService2 = (ReportService) context.getBean("reportService");

        // set authors
        reportService1.setAuthor("Jean Neige");
        reportService2.setAuthor("John Snow");

        // generate reports
        reportService1.generateReport();
        reportService2.generateReport();

        context.close();
    }
}