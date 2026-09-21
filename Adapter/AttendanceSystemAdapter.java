package adapterPatternSeatwork.Adapter;

import adapterPatternSeatwork.SchoolManagementApp;
import adapterPatternSeatwork.Adaptee.AttendanceSystem;

public class AttendanceSystemAdapter implements SchoolManagementApp{
    private AttendanceSystem as;

    public AttendanceSystemAdapter(AttendanceSystem as) {
        this.as = as;
    }

    @Override
    public void integrateSystem() {
        as.markAttendance();
    }
} 