package utils;

public enum Emoji {
	CHEF("\uD83D\uDC69\u200D\uD83C\uDF73"),
	WAITER("\uD83D\uDC81"),
	CUSTOMER("\uD83E\uDDD1\uD83C\uDF7D"),
	ERROR("⛔");

	private final String code;

	Emoji(String code) {
		this.code = code;
	}

	public String toString() {
		return this.code;
	}
}
