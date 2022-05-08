/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import btc.Incentive;
import core.DTNHost;
import java.util.Map;

/**
 *
 * @author gregoriusyuristamanugraha
 */
public class detectionTime extends Report {

    public detectionTime() {
        super.init();
    }

    @Override
    public void done() {
        write("host,detection time");
        for (Map.Entry<DTNHost, Double> detTime : Incentive.detectionTime.entrySet()) {
            write(detTime.getKey() + "," + detTime.getValue());
        }
        super.done();
    }
}
