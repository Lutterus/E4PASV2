package model;

import java.util.Observable;

public class CheckBoxes extends Observable {
	private boolean check1;
	private boolean check2;
	private boolean check3;
	private boolean check4;
	private boolean check5;
	private boolean check6;

	public CheckBoxes() {
		setCheck1(false);
		setCheck2(false);
		setCheck3(false);
		setCheck4(false);
		setCheck5(false);
		setCheck6(false);
	}

	public boolean isCheck1() {
		if (check1 == true) {
			setCheck1(false);
			return true;
		} else {
			setCheck1(true);
			return false;
		}
	}

	public void setCheck1(boolean check1) {
		this.check1 = check1;
	}

	public boolean isCheck2() {
		if (check2 == true) {
			setCheck2(false);
			return true;
		} else {
			setCheck2(true);
			return false;
		}
	}

	public void setCheck2(boolean check2) {
		this.check2 = check2;
	}

	public boolean isCheck3() {
		if (check3 == true) {
			setCheck3(false);
			return true;
		} else {
			setCheck3(true);
			return false;
		}
	}

	public void setCheck3(boolean check3) {
		this.check3 = check3;
	}

	public boolean isCheck4() {
		if (check4 == true) {
			setCheck4(false);
			return true;
		} else {
			setCheck4(true);
			return false;
		}
	}

	public void setCheck4(boolean check4) {
		this.check4 = check4;
	}

	public boolean isCheck5() {
		if (check5 == true) {
			setCheck5(false);
			return true;
		} else {
			setCheck5(true);
			return false;
		}
	}

	public void setCheck5(boolean check5) {
		this.check5 = check5;

	}

	public boolean isCheck6() {
		if (check6 == true) {
			setCheck6(false);
			return true;
		} else {
			setCheck6(true);
			return false;
		}
	}

	public void setCheck6(boolean check6) {
		this.check6 = check6;
	}

}