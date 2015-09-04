package com.bankonet.metier;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReportServiceTest {

    @Test
    public void testGenerateReport() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        ReportService reportService = (ReportService) context.getBean("reportService");

        reportService.generateReport();
    }
}