package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
//import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionsManager implements JobPositionService{
	
	
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionsManager(JobPositionDao jobPositionsDao) {
		super();
		this.jobPositionDao = jobPositionsDao;
	}
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Job positions listed.");		
	}

	@Override
	public Result add(JobPosition jobPosition) {
		
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Job position added.");
		
//		if(jobPositionDao.existsByJobPositionName(jobPosition.getName())) {
//			return new ErrorResult("Job position available.");
//		}
//		else {
//			this.jobPositionDao.save(jobPosition);
//			return new SuccessResult("Job position added.");
//		}
		
	}

}
