package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateMean() {
        double mean = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            mean += temperature.getValue();
        }
        mean /= temperatures.getTemperatures().size();
        return mean;
    }

    public double calculateMedian() {
        double median = 0;

        List<Double> medianList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {
                    medianList.add(temperature.getValue());
        }
        Collections.sort(medianList);
        if (medianList.size() % 2 == 0) {
            median = ((medianList.get(medianList.size() / 2)) + (medianList.get((medianList.size() / 2)-1))) / 2;
        } else {
            median = medianList.get(medianList.size() / 2);
        }
        return median;
    }
}