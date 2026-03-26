package edu.kis.powp.jobs2d.command;

import java.util.List;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> driverCommands;

    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    public void addCommand(DriverCommand driverCommand) {
        driverCommands.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand driverCommand : driverCommands) {
            driverCommand.execute(driver);
        }
    }
}
