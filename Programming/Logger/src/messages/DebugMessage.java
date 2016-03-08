package messages;

import model.ILogger;

public class DebugMessage extends ILogger.Message {

	public DebugMessage(String text) {
		super(text);
	}

	@Override
	public String build() {
		return "DEBUG: " + getText();
	}

}
