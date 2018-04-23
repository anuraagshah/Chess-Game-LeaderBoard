package controller;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javafx.stage.Stage;
import models.LeaderBoardModel;
import models.LeaderBoardModel.UserPartialInfo;
import views.LeaderBoardView;

public class LeaderBoardController {

	final LeaderBoardModel leaderBoardModel;
	final LeaderBoardView leaderBoardView;

	public LeaderBoardController(LeaderBoardModel leaderBoardModel, LeaderBoardView leaderBoardView) {
		this.leaderBoardModel = leaderBoardModel;
		this.leaderBoardView = leaderBoardView;
	}

	public void viewHighestScores() {
		List<UserPartialInfo> listSortedUsers = Collections.emptyList();
		try {
			listSortedUsers = this.leaderBoardModel.listSortedUsers();
		} catch (SQLException e) {
			// ignore
		}
		this.leaderBoardView.setListSortedUsers(listSortedUsers);
		this.leaderBoardView.start(new Stage());
	}

}
