package server.mapper;

import server.entity.Feedback;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface FeedbackMapper extends Mapper<Feedback>, InsertListMapper<Feedback> {
}