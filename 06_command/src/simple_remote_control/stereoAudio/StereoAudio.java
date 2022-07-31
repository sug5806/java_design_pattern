package simple_remote_control.stereoAudio;

public class StereoAudio {
    int volume = 0;


    public void on() {
        System.out.println("스테레오 오디오를 켭니다.");
    }

    public void setCD() {
        System.out.println("CD를 세팅합니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 " + this.volume + "으로 설정하였습니다.");
    }
}
