package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();

        List<Machine> list = new ArrayList<>();
        list.add(firstExcavator);
        list.add(secondExcavator);
        list.add(thirdExcavator);
        return list;
    }
}