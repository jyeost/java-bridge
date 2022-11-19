package bridge.view;

import bridge.model.BridgeSize;
import bridge.model.Moving;

public interface Input {
    BridgeSize readBridgeSize();

    Moving readMoving();
}
