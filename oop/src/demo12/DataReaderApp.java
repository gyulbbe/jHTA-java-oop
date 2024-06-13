package demo12;

public class DataReaderApp {

	public static void main(String[] args) {

		DataReader r1 = new DataReader();
		r1.read();
		
		ExcelDataReader r2 = new ExcelDataReader();
		r2.read();
		
		DatabaseDataReader r3 = new DatabaseDataReader();
		r3.read();
		
		DataReader r4 = new ExcelDataReader();
		r4.read();
//		r4.readExcel();
		
		DataReader r5 = new DatabaseDataReader();
		r5.read();
//		r5.readDB();
	}
}