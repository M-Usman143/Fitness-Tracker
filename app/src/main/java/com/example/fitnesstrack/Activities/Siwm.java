package com.example.fitnesstrack.Activities;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fitnesstrack.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class Siwm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siwm);


        LineChart lineChart = findViewById(R.id.lineChart);


        // Sample data for line chart
        ArrayList<Entry> lineEntries = new ArrayList<>();
        lineEntries.add(new Entry(0, 2));
        lineEntries.add(new Entry(1, 4));
        lineEntries.add(new Entry(2, 1));
        lineEntries.add(new Entry(3, 3));

        // Creating a dataset and styling it to be a curve
        LineDataSet lineDataSet = new LineDataSet(lineEntries, "Activity Data");
        lineDataSet.setColor(Color.GREEN); // Line color
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setLineWidth(2f);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER); // Curved lines

        // Set gradient fill under the line
        lineDataSet.setDrawFilled(true);  // Enable fill under the line
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.chart_fill_gradient); // Gradient drawable
        lineDataSet.setFillDrawable(drawable);  // Set gradient as fill

        // Adding dataset to line data
        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);

        // Disable grid lines and background shapes
        lineChart.setDrawGridBackground(false);
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getXAxis().setDrawGridLines(false);
        lineChart.getAxisRight().setDrawGridLines(false);

        // Disable axis lines
        lineChart.getAxisLeft().setDrawAxisLine(false);
        lineChart.getAxisRight().setDrawAxisLine(false);
        lineChart.getXAxis().setDrawAxisLine(false);

        // Disable left Y-axis (ranking numbers will only show on the right)
        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setEnabled(false);

        // Enable right Y-axis for showing the ranking numbers
        YAxis rightAxis = lineChart.getAxisRight();
        rightAxis.setEnabled(false);
        rightAxis.setTextColor(Color.BLACK);  // Set text color for the right axis
        rightAxis.setDrawLabels(true);        // Enable labels on the right side

        // Remove legend and description
        lineChart.getLegend().setEnabled(false);
        lineChart.getDescription().setEnabled(false);

        // Refresh chart
        lineChart.invalidate();
    }
}