package Chapter6EncapsulatingInvocation;

public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo s){

        stereo = s;
    }

    @Override
    public void execute(){

        stereo.off();
    }

    @Override
    public void undo(){

        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
