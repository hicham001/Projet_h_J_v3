package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.FeedbackModel;
import com.sqli.echallenge.bap.service.IFeedbackService;
import com.sqli.echallenge.bap.web.converters.IFeedbackConverter;
import com.sqli.echallenge.bap.web.dto.FeedbackDto;

public class IFeedbackFacadeImpl implements IFeedbackFacade{

	@Autowired
	private IFeedbackService feedbackService;
	private IFeedbackConverter converter;
	
	public void setFeedbackService(IFeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	public void setConverter(IFeedbackConverter converter) {
		this.converter = converter;
	}

	@Override
	public FeedbackDto find(Long modelId) {
		FeedbackModel feedbackModel = feedbackService.find(modelId);
		if(feedbackModel != null){
			return converter.convertModelDto(feedbackModel);
		}	
		return null;
	}

	@Override
	public Boolean delete(Long id) {
		return feedbackService.delete(id);
	}

	@Override
	public FeedbackDto edit(FeedbackDto feedback) {
		FeedbackModel feedbackModel = converter.convertDtoModel(feedback);
		if(feedbackModel != null)
		return  converter.convertModelDto(feedbackService.edit(feedbackModel));
		
		return null;
	}

	@Override
	public FeedbackDto save(FeedbackDto feedback) {
		FeedbackModel feedbackModel = converter.convertDtoModel(feedback);
		if(feedbackModel != null)
		return  converter.convertModelDto(feedbackService.save(feedbackModel));
		
		return null;
	}

	@Override
	public List<FeedbackDto> findAll() {
		List<FeedbackModel> feedbackModel = new ArrayList<FeedbackModel>();
		List<FeedbackDto> feedbackDto = new ArrayList<FeedbackDto>();
		feedbackModel = feedbackService.findAll();
		if(feedbackModel != null){
			for (FeedbackModel feedbackModel2 : feedbackModel) {
				feedbackDto.add(converter.convertModelDto(feedbackModel2));
			}
		return  feedbackDto;
		}		
	return null;
	}

}
