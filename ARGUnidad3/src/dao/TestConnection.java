package dao;

import model.Pacient;

public class TestConnection {
	public static void main(String[] args) {
		PacientDAOImpl pacientDAOImpl = new PacientDAOImpl();
		pacientDAOImpl.createPacient(new Pacient(1L, "Duffy", "nose", "Macho","Perro"));
	}
}
