package worldcup;

/**
 * Class to define the coach
 */ //hola
public class Coach extends Person {
	string style;

	public void train() {
		System.out.println("train");
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}
