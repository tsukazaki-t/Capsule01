package practice;

public class CapsuleTask {
	private String content;
	private int date;
	private String status;

	public CapsuleTask(String content, int date) {
		this.content = content;
		this.date = date;
		this.status = "未完了";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
