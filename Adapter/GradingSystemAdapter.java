package adapterPatternSeatwork.Adapter;

import adapterPatternSeatwork.SchoolManagementApp;
import adapterPatternSeatwork.Adaptee.GradingSystem;

public class GradingSystemAdapter implements SchoolManagementApp{
    private GradingSystem gs;

    public GradingSystemAdapter(GradingSystem gs) {
        this.gs = gs;
    }

    @Override
    public void integrateSystem() {
        gs.recordGrades();
    }
} 