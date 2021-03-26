package com.ibm.bts.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.ibm.bts.entity.Bug;
import com.ibm.bts.repo.BugRepository;

@Service
public class BugService { // Spring Beans,singleton design pattern
	@Autowired
	BugRepository bugRepository;

	public String createBug( Bug bug) {
		return bugRepository.save(bug).getId();
	}

	public List<Bug> getBugs() {
		return bugRepository.findAll();
	}

	public void updateBug(Bug bug) {
		bugRepository.save(bug);
	}

	public void deleteBug(String bugId) {
		bugRepository.deleteById(bugId);
	}

	public Optional<Bug> getBug(String bugId) {
		return bugRepository.findById(bugId);
	}
}
