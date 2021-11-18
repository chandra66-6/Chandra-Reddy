package techievishnu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techievishnu.dao.VardhanRepository;
import techievishnu.model.VardhanEntity;

@Service
public class VardhanService {

	@Autowired
	private VardhanRepository repo;
	
	public VardhanEntity saveVardhan(VardhanEntity vardhan) {
		  return repo.save(vardhan);
	}
	
	public List<VardhanEntity> saveVardhans(List<VardhanEntity> vardhans){
		   return repo.saveAll(vardhans);
	}
	
	public  List<VardhanEntity> getVardhans(){
		   return  repo.findAll();
	}
	
	public VardhanEntity getVardhanById(int id) {
		return repo.findById(id).orElse(null);
	
	}
	public VardhanEntity getVardhanByName(String name) {
		return repo.findByName(name);
	
	}
	 public String deleteVardhan(int id) {
		 repo.deleteById(id);
		 return "removed " +id;
	 }
	
	public VardhanEntity updateVardhan(VardhanEntity vardhan) {
		VardhanEntity existingVardhan=repo.findById(vardhan.getId()).orElse(null);
		existingVardhan.setName(vardhan.getName());
		existingVardhan.setMailid(vardhan.getMailid());
		existingVardhan.setMobno(vardhan.getMobno());
		  return repo.save(existingVardhan);
	}	
}
	
	

