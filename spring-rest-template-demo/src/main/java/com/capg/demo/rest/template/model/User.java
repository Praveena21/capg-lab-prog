package com.capg.demo.rest.template.model;

public class User {
private  String Login;
private  String Name;
private  String Location;
private  int public_repos;
private  String avatar_url;
public String getLogin() {
	return Login;
}
public void setLogin(String login) {
	Login = login;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public int getPublic_repos() {
	return public_repos;
}
public void setPublic_repos(int public_repos) {
	this.public_repos = public_repos;
}
public String getAvatar_url() {
	return avatar_url;
}
public void setAvatar_url(String avatar_url) {
	this.avatar_url = avatar_url;
}
public User(String login, String name, String location, int public_repos, String avatar_url) {
	super();
	Login = login;
	Name = name;
	Location = location;
	this.public_repos = public_repos;
	this.avatar_url = avatar_url;
}
@Override
public String toString() {
	return "User [Login=" + Login + ", Name=" + Name + ", Location=" + Location + ", public_repos=" + public_repos
			+ ", avatar_url=" + avatar_url + "]";
}


}
