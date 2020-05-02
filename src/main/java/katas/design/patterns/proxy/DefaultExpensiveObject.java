package katas.design.patterns.proxy;

import java.util.logging.Logger;

public class DefaultExpensiveObject implements ExpensiveObject {
    private static final Logger log = Logger.getLogger(DefaultExpensiveObject.class.getName());

    public DefaultExpensiveObject() {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration() {
        log.info("Loading initial configuration...");
    }

    @Override
    public void process() {
        log.info("processing complete.");
    }

}
