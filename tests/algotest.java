import algorithms.HybridAnomalyDetector;
import algorithms.SimpleAnomalyDetector;
import algorithms.ZscoreAnomalyDetector;
import model.Helpclass.TimeSeries;
import model.Helpclass.TimeSeriesAnomalyDetector;

import java.util.Arrays;

public class algotest {
    public static void main(String[] args) {
        TimeSeries ts = new TimeSeries("tests/normalData.csv");
        if(ts==null){
            System.out.println("create timeSeries didn't work");
            return;
        }
        TimeSeries detect_ts = new TimeSeries("tests/detectData.csv");


        //check the Simple AnomalyDetector algo
        // if he gets only feature with more than 0.9 coraltion with onther coraltion
        SimpleAnomalyDetector TsAS = new SimpleAnomalyDetector();
        // i create csv with 3/7 feature that have 0.9 coraltion
        TsAS.learnNormal(ts);
        if(TsAS.test()!=3)
            System.out.println("problem with learnNormal of Simple algo");
        TsAS.detect(detect_ts);
            if(TsAS.anomalyReportList.size()!=3)
                System.out.println("problem with detect in simple");





        //check the zscore algo AnomalyDetector
        // if he gets only feature with more than 0 coraltion with onther coraltion
        ZscoreAnomalyDetector TsAZ  = new ZscoreAnomalyDetector();
        // i create csv with 6/7 feature that have more than 0 coraltion
        TsAZ.learnNormal(ts);
        if(TsAZ.test()!=6)
            System.out.println("problem with learnNormal of zscore algo");
        TsAZ.detect(detect_ts);
        if(TsAZ.anomalyReportList.size()!=1)
            System.out.println("problem with detect in zscore");


        //check the Hybrid algo AnomalyDetector
        // if he gets  feature with more than 0.9 coraltion to line coraltion
        //feature with less than 0.5 more than 0 to zscore coraltion
        //and between 0.5 to 0.9 circle coraltion
        HybridAnomalyDetector TsAH = new HybridAnomalyDetector();
        // i create csv with 3/7 feature that have more than 0.9 coraltion
        // i create csv with 3/7 feature that have more than 0.5 and less than 0.9 coraltion
        TsAH.learnNormal(ts);
        int [] check = {3,3,0};
        if(check==TsAH.test())
             System.out.println("problem with learnNormal of hybrid algo");
        TsAH.detect(detect_ts);
        if(TsAH.anomalyReportList.size()!=6)
             System.out.println("problem with detect in hybrid");

        System.out.println("done");
    }


}