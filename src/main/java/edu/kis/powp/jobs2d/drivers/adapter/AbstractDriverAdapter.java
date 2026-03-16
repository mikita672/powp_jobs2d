package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDriverAdapter extends AbstractDriver {
    private Job2dDriver driver;

    public AbstractDriverAdapter(int x, int y, Job2dDriver driver) {
        super(x, y);
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        driver.setPosition(this.getX(), this.getY());
        driver.operateTo(x, y);
        setPosition(x, y);
    }
}
