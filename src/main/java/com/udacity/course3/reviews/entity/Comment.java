package com.udacity.course3.reviews.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTS")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comment_id;

	@Column(name = "comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "review_id")
	@JsonIgnore
	private Review review;

	public int getComemnt_id() {
		return comment_id;
	}

	public void setComemnt_id(int comemnt_id) {
		this.comment_id = comemnt_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	

}
