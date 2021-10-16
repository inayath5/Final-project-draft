package com.example.bloodbankmanagement.bloodbankmanagement.service;

import java.util.List;

import com.example.bloodbankmanagement.bloodbankmanagement.entity.Donor;

public interface DonorService {
	
	public void addDonor(Donor product);
	public void deleteDonor(Donor product);
	public List<Donor> getAllDonors();
	public Donor updateDonor(Donor product);
	public Donor getDonortById(Integer id);
}
                                                