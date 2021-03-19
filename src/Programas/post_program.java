package Programas;

import java.util.Date;
import java.util.Scanner;

import classes.Comment;
import classes.Post;

public class post_program {

	public static void main(String[] args) {

		// Creating post
		Scanner scan = new Scanner(System.in);

		System.out.println("enter post title: ");
		String title = scan.next();

		System.out.println("enter post content: ");
		String content = scan.next();

		double likes = Math.random();

		Date moment = new Date(System.currentTimeMillis());

		Post post = new Post(moment, title, content, likes);

		// Setting up comments
		Comment comment = new Comment();

		System.out.println("Digite o comentario desejado \n");
		String comment1 = scan.next();
		comment.setText(comment1);
		post.addComments(comment);

		System.out.println("Digite o comentario desejado \n");
		comment1 = scan.next();
		scan.close();
		comment.setText(comment1);
		post.addComments(comment);

		post.ToString();

	}

}
