package reporting;

public class ReportFormatter {
	
	String formattedValue;

	public ReportFormatter(Object object, FormatType formatType) {
		switch(formatType) {
		case XML:
			formattedValue =convertObjectToXML(object);
			break;
		case CSV:
			formattedValue =convertObjectToCSV(object);
			break;
		}
	}
	
	
	private String convertObjectToXML(Object object) {
		return "XML : <object>" + object.toString() + "</object>";
	}
	
	private String convertObjectToCSV(Object object) {
		return "CSV : ,,," + object.toString() + ",,,";
	}
	
	
	public String getFormattedValue() {
		return formattedValue;
	}
}
