package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 *	A1 [10,50]
	A2 [15,35]
	A3 [25,30]
 	
 	C1 [15, 25, [A1,A2]]
	C2 [25, 30, [A1,A2,A3]]
	C3 [30, 35, [A1,A2]]
	
	  A1s  A2s  A3s A3e A2e   A1e
	   |	|	|	|	|	  |
	A1 =======================
	A2		=============
	A3 			====

First scan through the list of appointments
Add it to the List<Events>
For each event in the list add it to the hash set, if its non-empty then there is conflcits

	E1 10, A1
	E2 15, A2
	E3 25, A3
	E4 30, A3
	E5 35, A2
	E6 50, A1

 */
		
public class AppointmentConflicts {

	class Appointment {
		int startTime;
		int emdTime;
		String id;
		
		public Appointment(int startTime, int emdTime, String id) {
			super();
			this.startTime = startTime;
			this.emdTime = emdTime;
			this.id = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + emdTime;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + startTime;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Appointment other = (Appointment) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (emdTime != other.emdTime)
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (startTime != other.startTime)
				return false;
			return true;
		}

		private AppointmentConflicts getOuterType() {
			return AppointmentConflicts.this;
		}
		
	}

	class Conflict {
		int startTime;
		int endTime;
		List<Appointment> appointments;
		
		public Conflict() {
			super();
			appointments = new ArrayList<>();
		}
	}
	
	class Event {
		Integer time;
		Appointment appointment;

		public Event(int time, Appointment appointment) {
			super();
			this.time = time;
			this.appointment = appointment;
		}
	}
	
	public List<Conflict> checkConflictAppointment(List<Appointment> appointments) {
		List<Event> appointmentEvents = new ArrayList<>();
		Set<Appointment> appointmentSet = new HashSet<>();
		List<Conflict> conflictList = new ArrayList<>();
		
		for(Appointment appointment : appointments ) {
			appointmentEvents.add(new Event(appointment.startTime,appointment));
			appointmentEvents.add(new Event(appointment.emdTime,appointment));
		}
		Collections.sort(appointmentEvents, (Event a, Event b) -> (a.time.compareTo(b.time)));
		/*
		 * 	E1 10, A1
			E2 15, A2
			E3 25, A3
			E4 30, A3
			E5 35, A2
			E6 50, A1

		 */
		int eventStart;
		int eventEnd;
		for(Event event : appointmentEvents) {
			Conflict conflict = new Conflict();
			if(appointmentSet.contains(event.appointment)) {
			//	eventEnd=event.time;
				appointmentSet.remove(event.appointment);
				if(appointmentSet.size()>1) {
					conflict.appointments.addAll(appointmentSet);
					conflictList.add(conflict);
				}
			} else {
			//	eventStart = event.time;
				appointmentSet.add(event.appointment);
				if(appointmentSet.size()>1) {
					conflict.startTime=event.time;
					//conflict.endTime=;
					conflict.appointments.addAll(appointmentSet);
					conflictList.add(conflict);
				}
			}
		}
		return conflictList;
	}
	
	@SuppressWarnings(value ="unused")
	@Test
	public void testScheduling() {
		Appointment a1 = new Appointment(10, 50, "A1");
		Appointment a2 = new Appointment(15, 35, "A2");
		Appointment a3 = new Appointment(30, 45, "A3");
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointments.add(a1);
		appointments.add(a2);
		appointments.add(a3);
		List<Conflict> conflicts = checkConflictAppointment(appointments);
		System.out.println();
	}
}


