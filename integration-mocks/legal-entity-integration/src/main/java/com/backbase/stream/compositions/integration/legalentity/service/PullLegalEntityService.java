package com.backbase.stream.compositions.integration.legalentity.service;

import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityRequest;
import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityResponse;

/**
 * Pull legal entity service.
 */
public interface PullLegalEntityService {
    /**
     * Pull legal entity.
     *
     * @param pullLegalEntityRequest Legal entity request
     * @return Legal entity
     */
    PullLegalEntityResponse pullLegalEntity(
            PullLegalEntityRequest pullLegalEntityRequest);
}
