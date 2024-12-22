package com.vinsguru.job_service.util;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.vinsguru.job_service.dto.JobDto;
import com.vinsguru.job_service.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {
    public  static JobDto toDto(Job job){
        JobDto dto = new JobDto();
        BeanUtils.copyProperties(job, dto);
        return  dto;
    }



    public  static Job toDto(JobDto dto){
        Job job = new Job();
        BeanUtils.copyProperties(dto, job);
        return  job;
    }


    public static Job toEntity(JobDto dto){
        Job job = new Job();
        BeanUtils.copyProperties(dto, job);
        return job;
    }
}
