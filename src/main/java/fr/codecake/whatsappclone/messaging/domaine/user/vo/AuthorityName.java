package fr.codecake.whatsappclone.messaging.domaine.user.vo;

import fr.codecake.whatsappclone.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name);
    }
}
