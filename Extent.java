package Selenium.Framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
	
static ExtentReports extent;
	
	public static ExtentReports getReporterObject()
	
 
 
		
		{
		String path=System.getProperty("user.dir")+"//Reports//index.html";
			ExtentSparkReporter reporter =new ExtentSparkReporter(path);
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test Result");
			
			
			 extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Sravani", "Automation Tester");
           return extent;
}
}


