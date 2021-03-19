package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private double likes;
	private List<Comment> comments = new ArrayList<>();

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");

	public Post(Date moment, String title, String content, double likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComments(Comment comment) {
		comments.add(comment);
	}

	public void addRemove(Comment comment) {
		comments.remove(comment);
	}

	public void ToString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.title + " \n");
		sb.append(this.likes + " likes - ");
		sb.append(sdf1.format(moment) + " \n");
		sb.append(this.content + " \n");
		sb.append(" Comments: \n");
		for (Comment comment : comments) {
			sb.append(comment.toString() + " \n");
		}

	}
}
