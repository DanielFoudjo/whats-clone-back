package fr.codecake.whatsappclone.messaging.domaine.message.aggregate;

import fr.codecake.whatsappclone.messaging.domaine.message.vo.ConversationName;
import fr.codecake.whatsappclone.messaging.domaine.user.vo.UserPublicId;
import fr.codecake.whatsappclone.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class ConversationToCreate {

    private final Set<UserPublicId> members;

    private final ConversationName name;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName name) {
        asserMandatoryFields(members, name);
        this.members = members;
        this.name = name;
    }

    private void asserMandatoryFields(Set<UserPublicId> members, ConversationName name){
        Assert.notNull("name", name);
        Assert.notNull("members", members);
    }
}
