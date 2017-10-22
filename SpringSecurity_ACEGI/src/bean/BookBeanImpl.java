package bean;

public class BookBeanImpl implements BookBean {

	private int value = 0;

	public BookBeanImpl() {
		super();
	}

	public int getValue() {
		return this.value;
	}

	// replace the value.
	public void setValue(int _value) {
		this.value = _value;
	}

	// change the value.
	public void changeValue(int _value) {
		this.value += _value;
	}
}