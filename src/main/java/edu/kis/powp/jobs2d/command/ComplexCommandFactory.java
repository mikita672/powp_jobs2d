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

    public static ComplexCommand createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(x1, y1));
        commands.add(new OperateToCommand(x2, y2));
        commands.add(new OperateToCommand(x3, y3));
        commands.add(new OperateToCommand(x1, y1));

        return new ComplexCommand(commands);
    }
}
