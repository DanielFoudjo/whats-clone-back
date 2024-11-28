package fr.codecake.whatsappclone.messaging.domaine.message.vo;

public record MessageContent(String text,
                             MessageType type,
                             MessageMediaContent media) {
}
