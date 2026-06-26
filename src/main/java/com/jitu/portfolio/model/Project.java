package com.jitu.portfolio.model;

public class Project {
	 private String title;
	    private String description;
	    private String tech;
	    private String github;
	    private String image;
	    
		public Project(String title, String description, String tech, String github,String image) {
			super();
			this.title = title;
			this.description = description;
			this.tech = tech;
			this.github = github;
			this.image=image;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public String getGithub() {
			return github;
		}
		public void setGithub(String github) {
			this.github = github;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		
	    
}
