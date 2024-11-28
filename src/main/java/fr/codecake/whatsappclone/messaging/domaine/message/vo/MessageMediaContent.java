package fr.codecake.whatsappclone.messaging.domaine.message.vo;

public record MessageMediaContent(byte[] file,
                                  String mimetype) {
}
