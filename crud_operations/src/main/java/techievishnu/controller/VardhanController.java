package techievishnu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import techievishnu.model.VardhanEntity;
import techievishnu.service.VardhanService;

@RestController
public class VardhanController {
	
	@Autowired
	private VardhanService service ;
	
	
	@PostMapping("/addVardhan")
	public VardhanEntity addVardhan(@RequestBody VardhanEntity vardhan) {
		return service.saveVardhan(vardhan);
	}

	@PostMapping("/addVardhans")
	public List<VardhanEntity> addVardhans(@RequestBody List<VardhanEntity> vardhans){
		return service.saveVardhans(vardhans);
	}
	
	@GetMapping("/vardhans")
	public List<VardhanEntity> findallVardhans(){
		return service.getVardhans();
	}
	@GetMapping("/vardhan/{id}")
	public VardhanEntity findVardhanById(int id) {
		return service.getVardhanById(id);
	}
	@GetMapping("/vardhan/{name}")
	public VardhanEntity findVardhanByName(@PathVariable String name) {
		return service.getVardhanByName(name);
	}
	@PutMapping("/update")
	public VardhanEntity updateVardhan(@RequestBody VardhanEntity vardhan) {
	      return service.updateVardhan(vardhan);	
	}
	@DeleteMapping("/delete/{id}")
    public String deleteVardhan(@PathVariable int id) {
    	   return service.deleteVardhan(id);
    }
	
}
