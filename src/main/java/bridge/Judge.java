package bridge;

import java.util.List;

public class Judge {

    String upLine = "";
    String downLine = "";


    public boolean checkIsCorrectMoving(List<String> bridge, List<String> userBridge) {
        int compareIndex = userBridge.size() - 1;
        return bridge.get(compareIndex).equals(userBridge.get(compareIndex));
    }

    public void makeResult(List<String> bridge, List<String> userBridge) {

        for (int i = 0; i < userBridge.size(); i++) {

            if(i==0){
                upLine += "[ ";
                downLine += "[ ";
            }
            if("U".equals(userBridge.get(i))){
                if(bridge.get(i).equals(userBridge.get(i))){
                    upLine += "O";
                    downLine += " ";
                }
                if(!bridge.get(i).equals(userBridge.get(i))){
                    upLine += "X";
                    downLine += " ";
                }
            }
            if("D".equals(userBridge.get(i))){
                if(bridge.get(i).equals(userBridge.get(i))){
                    upLine += " ";
                    downLine += "O";
                }
                if(!bridge.get(i).equals(userBridge.get(i))){
                    upLine += " ";
                    downLine += "X";
                }
            }

            if(i!=userBridge.size()-1){
                upLine += " | ";
                downLine += " | ";
            }

            if(i==userBridge.size()-1){
                upLine += " ]";
                downLine += " ]";
            }
        }
    }

    @Override
    public String toString() {
        return upLine + "\n" + downLine;
    }
}
