package gov.usgs.aqcu.model.config;

import java.util.ArrayList;
import java.util.List;

public class GroupConfig {
	private List<String> authorizedUsers;

	public GroupConfig() {
		authorizedUsers = new ArrayList<>();
	}

	public List<String> getAuthorizedUsers() {
		return authorizedUsers;
	}

	public void setAuthorizedUsers(List<String> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}
}