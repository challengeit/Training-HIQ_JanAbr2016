package model;

public interface ILogger {
	
	public abstract class Message {
		private final String text;
		public Message(String text) {
			this.text = text;
		}
		
		protected String getText() {
			return text;
		}
		
		public abstract String build();
	}
	
	void write(Message message);
}
