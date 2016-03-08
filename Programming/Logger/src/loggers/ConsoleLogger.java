package loggers;

import model.ILogger;

public class ConsoleLogger implements ILogger {

	@Override
	public void write(Message msg) {
		System.out.println(msg.build());
	}
}
