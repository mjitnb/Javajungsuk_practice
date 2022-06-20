package ch07;


abstract class Player {				//추상 클래스
	abstract void play(int pos);	//추상메서드
	abstract void stop();			//추상 메서드
}

class AudioPlayer extends Player {
	void play(int pos) { /* 내용 생략 */ }	//추상메서드를 구현
	void stop() { /* 내용 생략 */ }			//추상메서드를 구현
}

abstract class AbstractPlayer extends Player {
	void play(int pos) { /* 내용 생략 */ } 	//추상메서드를 구현
}



public class ch07_10 {

}
