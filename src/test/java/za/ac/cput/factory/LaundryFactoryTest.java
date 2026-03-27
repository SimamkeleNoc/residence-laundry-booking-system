/*
 * Name:Lindokuhle Nanto
 * Student Nr:240443608
 * Date: 20 March 2026
 * */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.LaundryMachine;
import za.ac.cput.domain.MachineStatus;

import static org.junit.jupiter.api.Assertions.*;

class LaundryMachineFactoryTest {

    @Test
    void createLaundryMachine() {
        LaundryMachine machine = LaundryMachineFactory.createLaundryMachine(
                "M001",
                1,
                MachineStatus.AVAILABLE
        );

        assertNotNull(machine);
        assertEquals("M001", machine.getMachineId());
        assertEquals(1, machine.getMachineNumber());
        assertEquals("AVAILABLE", machine.getStatus());
    }

    @Test
    void createLaundryMachineInvalid() {
        LaundryMachine machine = LaundryMachineFactory.createLaundryMachine(
                "",
                -1,
                null
        );

        assertNull(machine);
    }


}
