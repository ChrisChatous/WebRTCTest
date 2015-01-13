package org.appspot.apprtc;

import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;

/**
 * Created by chris on 1/13/15.
 */
public class ChrisRTCClient implements AppRTCClient {
    @Override
    public void connectToRoom(String url, boolean loopback) {

    }

    @Override
    public void sendOfferSdp(SessionDescription sdp) {

    }

    @Override
    public void sendAnswerSdp(SessionDescription sdp) {

    }

    @Override
    public void sendLocalIceCandidate(IceCandidate candidate) {

    }

    @Override
    public void disconnectFromRoom() {

    }
}
