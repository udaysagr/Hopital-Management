package com.htc.patientmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.htc.patientmanagement.entity.Patient;

@Repository
public class PatientImplementation implements PatientInterface{

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		boolean addPatientFlag=false;
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction =entityManager.getTransaction();
		 try {
		 		entityTransaction.begin();
		 		entityManager.persist(patient);
		 		entityTransaction.commit();
		 		addPatientFlag=true;
		 	}catch (Exception e) {
		 		entityTransaction.rollback();
		 		e.printStackTrace();
			}finally {
				entityManager.close();
			}
		return addPatientFlag;
	}

	@Override
	public boolean updatePatient(long id, String disease) {
		// TODO Auto-generated method stub
		boolean updatePatientFlag=false;
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction =entityManager.getTransaction();
		 try {
		 		entityTransaction.begin();
		 		Patient patient=(Patient)entityManager.find(Patient.class, id);
		 		patient.setDisease(disease);
		 		entityTransaction.commit();
		 		updatePatientFlag=true;
		 	}catch (Exception e) {
		 		entityTransaction.rollback();
		 		e.printStackTrace();
			}finally {
				entityManager.close();
			}
		return updatePatientFlag;
	}

	@Override
	public boolean deletepatient(long patientid) {
		// TODO Auto-generated method stub
		 boolean deletepatientFlag=false;
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction =entityManager.getTransaction();
		 try {
		 		entityTransaction.begin();
		 		Patient patient=(Patient)entityManager.find(Patient.class, patientid);
		 		entityManager.remove(patient);
		 		entityTransaction.commit();
		 		deletepatientFlag=true;
		 	}catch (Exception e) {
		 		entityTransaction.rollback();
		 		e.printStackTrace();
			}finally {
				entityManager.close();
			}
		return deletepatientFlag;
	}

	@Override
	public Patient getPatientById(long patientId) {
		// TODO Auto-generated method stub
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 Patient patient=null;
		 try{
			 patient=(Patient) entityManager.find(Patient.class, patientId);
			 }catch (Exception e) {
		          e.printStackTrace();
		}finally {
			entityManager.close();
		}
		return patient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		List<Patient> patientlist=new ArrayList<>();
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 try {
			 patientlist=entityManager.createQuery("FROM Patient").getResultList();
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}finally {
			entityManager.close();
		}
		 return patientlist;
	}

	@Override
	public Patient getByFirstName(String patientFirstName) {
		// TODO Auto-generated method stub
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		 Patient patient=null;
		 try {
		    patient= (Patient)entityManager.createQuery("SELECT b.patient_id,b.disease,b.first_name,b.last_name,b.mobile_number FROM patient b WHERE b.first_name=?1").setParameter(1, patientFirstName); //SELECT patient_id,disease,first_name,last_name,mobile_number
		    		}catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		finally {
			entityManager.close();
		}
		return patient;
	}
	
	
	
}
