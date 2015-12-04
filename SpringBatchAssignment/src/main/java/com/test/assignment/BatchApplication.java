package com.test.assignment;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchApplication {

    public static void main(String[] args) {
    	BatchApplication batchApplication = new BatchApplication();
    	batchApplication.run();
      }

      private void run() {

    	String[] springConfig = { "com/test/assignment/applicationContext.xml" };

    	ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

    	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
    	Job job = (Job) context.getBean("assignmentJob");

    	try {
    		JobParameters param = new JobParametersBuilder().toJobParameters();
    			
    		JobExecution execution = jobLauncher.run(job, param);
    		System.out.println("###### Exit Status : " + execution.getStatus());
    		System.out.println("###### Exit Status : " + execution.getAllFailureExceptions());
    		System.out.println("###### Batch Job Exectuted SUCCESSFULLY !!!! ");
    	} catch (Exception e) {
    		System.out.println("###### Batch Failed !!!  ");
    		e.printStackTrace();
    	}
      }
}
