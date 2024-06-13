package demo13;

public class Reporter {

	private Chart chart = new LineChart();
	
	public void createReporter() {
		chart.defineTitle();	//제목
		chart.defineLegend();	//범례
		chart.draw();			//차트 그리기
	}
	
	public static void main(String[] args) {
		Reporter reporter = new Reporter();
		reporter.createReporter();
	}
}
