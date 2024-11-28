package fr.codecake.whatsappclone.messaging.domaine.message.repository;

import fr.codecake.whatsappclone.messaging.domaine.message.aggregate.Conversation;
import fr.codecake.whatsappclone.messaging.domaine.message.aggregate.Message;
import fr.codecake.whatsappclone.messaging.domaine.message.vo.ConversationPublicId;
import fr.codecake.whatsappclone.messaging.domaine.message.vo.MessageSendState;
import fr.codecake.whatsappclone.messaging.domaine.user.aggregate.User;
import fr.codecake.whatsappclone.messaging.domaine.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState messageSendState);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);
}
