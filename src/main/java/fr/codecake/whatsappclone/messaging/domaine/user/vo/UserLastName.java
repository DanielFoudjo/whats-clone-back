package fr.codecake.whatsappclone.messaging.domaine.user.vo;

import fr.codecake.whatsappclone.shared.error.domain.Assert;

public record UserLastName(String value) {

    public UserLastName {
        Assert.field(value, value).maxLength(255);
    }
}
