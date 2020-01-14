import java.util.*;
import java.io.*;

class Stage implements Comparable<Stage>{
	private int stageNumber; 
	private double failureRate, playersChallengeStage, playersStuckWithStage;

	Stage(int stageNumber){
		this.stageNumber = stageNumber;
		playersChallengeStage = playersStuckWithStage = failureRate = 0;
	}

	public void addPlayersChallengeStage(){ this.playersChallengeStage++; }
	public void addPlayersStuckWithStage() { this.playersStuckWithStage++; }

	public int getStageNumber() { return this.stageNumber; }

	public void setFailureRate() {
		if(playersChallengeStage == 0) failureRate = 0;
		else failureRate = playersStuckWithStage / playersChallengeStage;
	}

	@Override
	public int compareTo(Stage o){
		if(this.failureRate == o.failureRate) return this.stageNumber - o.stageNumber;
		else if(o.failureRate >= this.failureRate) return 1;
		else return -1;
	}
}

class FailureRate_2_Steven{

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] players = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
		int N = 5;
		
		Stage[] stages = new Stage[N+1];
	
		stages[0] = new Stage(501);
		for(int i = 1 ; i <= N ; i++){
			stages[i] = new Stage(i);
		}

		for(int i = 0 ; i < players.length ; i++){
			if(players[i] <= N) stages[players[i]].addPlayersStuckWithStage();
			for(int j = 1 ; j <= players[i] && j <= N ; j++){
				stages[j].addPlayersChallengeStage();
			}
		}

		for(int i = 1 ; i <= N ; i++){
			stages[i].setFailureRate();
		}

		Arrays.sort(stages);

		for(int i = 0 ; i < N ; i++){
			bw.write(stages[i].getStageNumber() + " ");
		}

		bw.flush();

		bw.close();
	}
}
