package Exercicio3;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.junit.Test;
import org.junit.internal.Throwables;

public class ClassExercico3 {
   @Test
public void VerificaDataHoje() throws Exception {
	LocalDate hoje = new LocalDate(2017, 4, 1);
	assertEquals(1, hoje.getDayOfMonth());
	assertEquals(4, hoje.getMonthOfYear());
	assertEquals(2017, hoje.getYear());
}
   @Test
public void VerificaDataNascimento() throws Exception {
	LocalDate hoje = new LocalDate(2000, 5, 1);
	assertEquals(1, hoje.getDayOfMonth());
	assertEquals(5, hoje.getMonthOfYear());
	assertEquals(2000, hoje.getYear());
}
   @Test
   public void TimeNow() throws Exception {
	   LocalTime hoje = new LocalTime(7, 30);
	   assertEquals(6, hoje.getHourOfDay());
	   assertEquals(30, hoje.getMinuteOfHour());
   }
   @Test(expected = IllegalFieldValueException.class)
   public void NaoPodeCriarHorariosNegativos() throws Exception {
	   new LocalTime (-10,0);
   }
   
   @Test(expected = IllegalFieldValueException.class)
   public void NaoPodeCriarDiaAnoBissesto() throws Exception {
	   new LocalDate(2017, 2, 29);
 }
   @Test
   public void SomarDiaAhUmaData() throws Exception {
	   LocalDate vinteOitodefevereiro = new LocalDate (2017, 2, 28);
	   LocalDate umdemarco = new LocalDate (2017, 3, 01);
	   LocalDate dataSoma = vinteOitodefevereiro.plusDays(1);
	   assertEquals(2017,  dataSoma.getYear());
	   assertEquals(umdemarco, dataSoma);
}
//classe DateTime
   @Test
   public void Datas() throws Exception {
	   DateTime DataInicio = new DateTime (2017, 3, 31, 18, 30);
	   assertEquals(2017, DataInicio.getYear());
	   assertEquals(2017, DataInicio.getMonthOfYear());
	   assertEquals(2017, DataInicio.getDayOfMonth());
	   assertEquals(2017, DataInicio.getHourOfDay());
	   assertEquals(2017, DataInicio.getMinuteOfHour());
}
//Intervalo de datas
   @Test
   public void IntervaloDatas() throws Exception {
	   DateTime DataInicio = new DateTime (2017, 3, 31, 18, 30);
	   DateTime DataFim = new DateTime (2017, 5, 6, 18, 30);
	   Interval intervalo = new Interval(DataInicio, DataFim);
	   
	   assertTrue(intervalo.containsNow());
	   assertEquals(36, intervalo.toDuration().getStandardDays());
	   assertEquals(864, intervalo.toDuration().getStandardHours());
	   System.out.println("Imprimir no console");
}
}
