package model;

public enum TipoVuelo {

	  NACIONAL(0),INTERNACIONA(1);

	  private int num;

	  private TipoVuelo(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
