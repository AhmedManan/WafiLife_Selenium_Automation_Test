package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentFactory {

	public static final ExtentReports extentReports = new ExtentReports();
	public synchronized static ExtentReports getInstance() {
		ExtentSparkReporter reporter= new ExtentSparkReporter("./reports/Reports.html");
		reporter.config().setReportName("Sample Report");
		extentReports.attachReporter(reporter);
		return extentReports;
		
	}
	
}
