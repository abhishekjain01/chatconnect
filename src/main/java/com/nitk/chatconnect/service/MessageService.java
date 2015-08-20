package com.nitk.chatconnect.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nitk.chatconnect.entity.Message;
import com.nitk.chatconnect.entity.User;
import com.nitk.chatconnect.mapper.MessageMapper;

@Service
public class MessageService {

	@Autowired
	private MessageMapper messageMapper;

	@Transactional(readOnly = true)
	public ArrayList<Message> getMessagesForUser(User user) {
		return (ArrayList<Message>) messageMapper.getMessagesForUser(user
				.getId());
	}

	@Transactional(readOnly = true)
	public Message getMessageById(long id) {

		return messageMapper.getMessageById(id);

	}
}
