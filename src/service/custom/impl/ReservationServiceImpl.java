package service.custom.impl;

import dao.custom.ReservationDAO;
import dao.custom.impl.ReservationDAOImpl;
import dto.ReservationDTO;
import dto.RoomsDTO;
import entity.Reservation;
import service.custom.ReservationService;
import service.custom.util.Convertor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReservationServiceImpl implements ReservationService {

    private final ReservationDAO reservationDAO = new ReservationDAOImpl();
    private final Convertor convertor = new Convertor();

    @Override
    public ArrayList<ReservationDTO> getAllReservation() throws SQLException, ClassNotFoundException {
        return null;// (ArrayList<Reservation) reservationDAO.getAll().stream().collect(Collectors.toList());
    }

    @Override
    public String GenerateReservationId() {
        return reservationDAO.GenerateReservationId();
    }

    @Override
    public boolean updateUsingId(String id, String status) {
        return reservationDAO.updateUsingId(id,status);
    }

    @Override
    public boolean saveReservation(ReservationDTO reservationDTO) throws SQLException, ClassNotFoundException {
        return reservationDAO.save(convertor.toReservation(reservationDTO));
    }
    @Override
    public boolean updateReservation(ReservationDTO reservationDTO) throws SQLException, ClassNotFoundException {
        return true;// reservationDAO.update(convertor.toReservation(reservationDTO));
    }
    @Override
    public boolean deleteReservation(String id) throws SQLException, ClassNotFoundException {
        return reservationDAO.deleteByPk(id);
    }
    @Override
    public ReservationDTO searchReservation(String id) throws SQLException, ClassNotFoundException {
//        return reservationDAO.findByPk(id);
        return null;
    }


}
