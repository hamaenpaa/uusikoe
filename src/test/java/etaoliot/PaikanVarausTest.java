package etaoliot;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PaikanVarausTest {
	
	private Date getPastDate(int daysInPast) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		gc.roll(Calendar.DAY_OF_MONTH, -daysInPast);
		return gc.getTime();
	}
	
	@Test
	public void testLuoPaikanVaraus1() {
		PaikanVaraus paikanVaraus = new PaikanVaraus();
		IstumaPaikka istumaPaikka = mock(IstumaPaikka.class);
		Matkustaja matkustaja = mock(Matkustaja.class);
		Matka matka = mock(Matka.class);
		Date dtReservation = getPastDate(200);
		paikanVaraus.setIstumaPaikka(istumaPaikka);
		paikanVaraus.setMatkustaja(matkustaja);
		paikanVaraus.setMatka(matka);
		paikanVaraus.setiPrioriteetti(2);
		paikanVaraus.setlAktiivinen(true);
		paikanVaraus.setHinta(75.0);
		paikanVaraus.setDtVarausPvm(dtReservation);
		
		assertEquals(istumaPaikka, paikanVaraus.getIstumaPaikka());
		assertEquals(matkustaja, paikanVaraus.getMatkustaja());
		assertEquals(matka, paikanVaraus.getMatka());
		assertEquals(dtReservation, paikanVaraus.getDtVarausPvm());
		assertEquals(true, paikanVaraus.islAktiivinen());
		assertEquals(75.0, paikanVaraus.getHinta(), 0.001);
		assertEquals(2, paikanVaraus.getiPrioriteetti());
	}
	
	@Test
	public void testLuoPaikanVaraus2() {
		IstumaPaikka istumaPaikka = mock(IstumaPaikka.class);
		Matkustaja matkustaja = mock(Matkustaja.class);
		Date dtReservation = getPastDate(200);
		Matka matka = mock(Matka.class);
		PaikanVaraus paikanVaraus = new PaikanVaraus(istumaPaikka, 
				matkustaja, dtReservation, 2, true, matka,
				75.0);
		assertEquals(istumaPaikka, paikanVaraus.getIstumaPaikka());
		assertEquals(matkustaja, paikanVaraus.getMatkustaja());
		assertEquals(matka, paikanVaraus.getMatka());
		assertEquals(dtReservation, paikanVaraus.getDtVarausPvm());
		assertEquals(true, paikanVaraus.islAktiivinen());
		assertEquals(75.0, paikanVaraus.getHinta(), 0.001);
		assertEquals(2, paikanVaraus.getiPrioriteetti());
	}
}
