package adapterPatternSeatwork.Adapter;

import adapterPatternSeatwork.SchoolManagementApp;
import adapterPatternSeatwork.Adaptee.LibrarySystem;

public class LibrarySystemAdapter implements SchoolManagementApp{
    private LibrarySystem ls;

    public LibrarySystemAdapter(LibrarySystem ls) {
        this.ls = ls;
    }

    @Override
    public void integrateSystem() {
        as.manageBooks();
    }
} 