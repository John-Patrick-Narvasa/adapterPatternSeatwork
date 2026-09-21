package adapterPatternSeatwork;

import adapterPatternSeatwork.Adaptee.*;
import adapterPatternSeatwork.Adapter.*;

public class Main {
    public static void main(String[] args) {
        AttendanceSystem as = new AttendanceSystem();
        SchoolManagementApp asInt = new AttendanceSystemAdapter(as);

        GradingSystem gs = new GradingSystem();
        SchoolManagementApp gsInt = new GradingSystemAdapter(gs);

        LibrarySystem ls = new LibrarySystem();
        SchoolManagementApp lsInt = new LibrarySystemAdapter(ls);

        asInt.integrateSystem();
        gsInt.integrateSystem();
        lsInt.integrateSystem();
    }
} 