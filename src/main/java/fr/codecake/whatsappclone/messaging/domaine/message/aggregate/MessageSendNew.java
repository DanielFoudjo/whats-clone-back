package fr.codecake.whatsappclone.messaging.domaine.message.aggregate;

import fr.codecake.whatsappclone.messaging.domaine.message.vo.ConversationPublicId;
import fr.codecake.whatsappclone.messaging.domaine.message.vo.MessageContent;

public record MessageSendNew(MessageContent messageContent, ConversationPublicId conversationPublicId) {
}
