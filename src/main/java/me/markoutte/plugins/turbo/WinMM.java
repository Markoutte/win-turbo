package me.markoutte.plugins.turbo;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface WinMM extends StdCallLibrary {

    WinMM lib = Native.load("winmm", WinMM.class);

    int timeBeginPeriod(int period);

    int timeEndPeriod(int period);

    static void begin(int period) {
        lib.timeBeginPeriod(period);
    }

    static void end(int period) {
        lib.timeEndPeriod(period);
    }

}
