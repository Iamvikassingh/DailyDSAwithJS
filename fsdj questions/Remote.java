interface RemoteControl {
    void pressPower();
    void pressVolumeUp();
    void pressVolumeDown();

    default void pressMute() {
        System.out.println("Mute toggled.");
    }

    static String checkDeviceStatus(RemoteControl remote) {
        return "Device is operational.";
    }
}

class TVRemote implements RemoteControl {
    @Override
    public void pressPower() {
        System.out.println("TV Power toggled.");
    }

    @Override
    public void pressVolumeUp() {
        System.out.println("TV Volume Up.");
    }

    @Override
    public void pressVolumeDown() {
        System.out.println("TV Volume Down.");
    }
}

class StereoRemote implements RemoteControl {
    @Override
    public void pressPower() {
        System.out.println("Stereo Power toggled.");
    }

    @Override
    public void pressVolumeUp() {
        System.out.println("Stereo Volume Up.");
    }

    @Override
    public void pressVolumeDown() {
        System.out.println("Stereo Volume Down.");
    }
}

public class Remote {
    public static void main(String[] args) {
        RemoteControl tvRemote = new TVRemote();
        tvRemote.pressPower();
        tvRemote.pressVolumeUp();
        tvRemote.pressVolumeDown();
        tvRemote.pressMute();
        System.out.println(RemoteControl.checkDeviceStatus(tvRemote));

        RemoteControl stereoRemote = new StereoRemote();
        stereoRemote.pressPower();
        stereoRemote.pressVolumeUp();
        stereoRemote.pressVolumeDown();
        stereoRemote.pressMute();
        System.out.println(RemoteControl.checkDeviceStatus(stereoRemote));
    }
}