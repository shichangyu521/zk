package com.ziigeer.project.common;

import java.util.ArrayList;
import java.util.List;

public class ExceptionUtil extends Exception {

    private List<Throwable> cause = new ArrayList<>();

    public List<Throwable> getException() {
        return cause;
    }
}
