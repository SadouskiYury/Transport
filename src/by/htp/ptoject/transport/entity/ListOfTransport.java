package by.htp.ptoject.transport.entity;

public class ListOfTransport {
	private Transport[] arr;
	private int size;
	private int numberOfList = 0;

	public ListOfTransport(int size) {
		arr = new Transport[size];
		this.size = size;
	}

	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\n");
		}
	}

	public void addList(Transport name) {
		if (numberOfList < arr.length) {
			arr[numberOfList] =  name;
		}
		numberOfList++;
		
	}

}
