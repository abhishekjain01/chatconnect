package com.nitk.chatconnect.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.nitk.chatconnect.entity.Message;

public interface MessageMapper {
	@Select("SELECT * FROM message WHERE id = #{messageId}")
	Message getMessageById(@Param("messageId") long messageId);

	@Select("SELECT * FROM message WHERE receiverId = #{receiverId}")
	List<Message> getMessagesForUser(@Param("receiverId") long receiverId);

}
