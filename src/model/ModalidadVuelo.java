package model;

public enum ModalidadVuelo {

	IDA(0), IDA_VUELTA(1);
	
	private int num; 
	
	private ModalidadVuelo(int num){
		this.num=num;
	}
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}