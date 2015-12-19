package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.FeedbackModel;
import com.sqli.echallenge.bap.web.dto.FeedbackDto;

public interface IFeedbackConverter {

	public FeedbackDto convertModelDto(FeedbackModel source);
	public FeedbackModel convertDtoModel(FeedbackDto source);
	
	public FeedbackDto convertModelDto(FeedbackModel source, boolean includeRelation);
	public FeedbackModel convertDtoModel(FeedbackDto source, boolean includeRelation);

	public Collection<FeedbackModel> convertListDtoModel(Collection<FeedbackDto> source, boolean includeRelation);
	public Collection<FeedbackDto> convertListModelDto(Collection<FeedbackModel> source, boolean includeRelation);
	
	public Collection<FeedbackModel> convertListDtoModel(Collection<FeedbackDto> source);
	public Collection<FeedbackDto> convertListModelDto(Collection<FeedbackModel> source);

}
