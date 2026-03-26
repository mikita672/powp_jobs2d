package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {
    public static ComplexCommand createRectangle(int x, int y, int width, int height) {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(x, y));
        commands.add(new OperateToCommand(x + width, y));
        commands.add(new OperateToCommand(x + width, y + height));
        commands.add(new OperateToCommand(x, y + height));
        commands.add(new OperateToCommand(x, y));

        return new ComplexCommand(commands);
    }
}
