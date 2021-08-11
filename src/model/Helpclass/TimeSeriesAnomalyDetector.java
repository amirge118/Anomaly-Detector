package model.Helpclass;

import javafx.scene.chart.XYChart;

import java.util.HashMap;
import java.util.List;

public interface TimeSeriesAnomalyDetector {
	void learnNormal(TimeSeries ts);
	HashMap<String,List<AnomalyReport>> detect(TimeSeries ts);
	List<XYChart.Series> paint(TimeSeries ts,String feature);
	float[] detect_P(TimeSeries ts,String feature,int time_step);
}
