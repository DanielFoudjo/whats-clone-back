package fr.codecake.whatsappclone.messaging.domaine.message.aggregate;

import fr.codecake.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations{
        Assert.field("conversation", conversations).notNull().noNullElement();
    }

}
