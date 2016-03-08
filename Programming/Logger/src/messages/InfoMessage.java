package messages;

import model.ILogger;

public class InfoMessage extends ILogger.Message {

	public InfoMessage(String text) {
		super(text);
	}

	@Override
	public String build() {
		return "INFO: " + getText();
	}
}
