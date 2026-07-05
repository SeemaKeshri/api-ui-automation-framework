package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            String reportPath = System.getProperty("user.dir")
                    + "/reports/ExtentReport.html";

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(reportPath);

            sparkReporter.config().setReportName("API Automation Report");
            sparkReporter.config().setDocumentTitle("REST Assured Framework");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Framework", "REST Assured");
            extent.setSystemInfo("Language", "Java");
            extent.setSystemInfo("Tester", "Seema Keshri");
        }

        return extent;
    }
}