package com.siwar.demo.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.siwar.demo.entities.Parfum;
import com.siwar.demo.service.ParfumService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ParfumRESTController {
	@Autowired
	ParfumService parfumService;
	 @RequestMapping(method = RequestMethod.GET)
	 @GetMapping("/parfums")
	public List<Parfum> getAllParfums() {
	return parfumService.getAllParfums();
	}
	 @RequestMapping(value="/{id}",method = RequestMethod.GET)
	 @GetMapping("/{id}")
	 public Parfum getParfumById(@PathVariable("id") Long id) {
		 return parfumService.getParfum(id);
	  }
	 //@RequestMapping(method = RequestMethod.POST)
	 @PostMapping()
	 public Parfum createParfum(@RequestBody Parfum parfum) {
	 return parfumService.saveParfum(parfum);
	 }
	//@RequestMapping(method = RequestMethod.PUT)
	 @PutMapping()
	 public Parfum updateParfum(@RequestBody Parfum parfum) {
	 return parfumService.updateParfum(parfum);
	 }
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	 @DeleteMapping("/{id}")
	public void deleteParfum(@PathVariable("id") Long id)
	{
	parfumService.deleteParfumById(id);
	}
	//@RequestMapping(value="/prodsgen/{idGen}",method = RequestMethod.GET)
	 @GetMapping("/prodsgen/{idGen}")
	public List<Parfum> getProduitsByCatId(@PathVariable("idGen") int idGen) {
	return parfumService.findByGenreIdGen(idGen);
	}




}
