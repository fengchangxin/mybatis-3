package main;


/**
 * @author: fcx
 * @date: 2019-11-03 21:22
 * @description:
 */
public interface VehicleMapper {
    Long save(Vehicle vehicle);

    Vehicle getById(Long vehicleId);
}
