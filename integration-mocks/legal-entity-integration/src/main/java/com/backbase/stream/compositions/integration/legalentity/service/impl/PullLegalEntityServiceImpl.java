package com.backbase.stream.compositions.integration.legalentity.service.impl;

import java.util.List;

import com.backbase.stream.compositions.integration.legalentity.model.JobProfileUser;
import com.backbase.stream.compositions.integration.legalentity.model.LegalEntity;
import com.backbase.stream.compositions.integration.legalentity.model.LegalEntityType;
import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityRequest;
import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityResponse;
import com.backbase.stream.compositions.integration.legalentity.model.User;
import com.backbase.stream.compositions.integration.legalentity.service.PullLegalEntityService;
import org.springframework.stereotype.Service;

/**
 * {@inheritDoc}
 */
@Service
public class PullLegalEntityServiceImpl implements PullLegalEntityService {
    private static final String REFERENCE_JOB_ROLE = "Regular User Job Role";

    /**
     * {@inheritDoc}
     */
    @Override
    public PullLegalEntityResponse pullLegalEntity(PullLegalEntityRequest pullLegalEntityRequest) {
        return new PullLegalEntityResponse()
            .withLegalEntity(
                new LegalEntity()
                    .withLegalEntityType(LegalEntityType.CUSTOMER)
                    .withUsers(List.of(
                        new JobProfileUser()
                            .withUser(
                                new User()
                                    .withExternalId(pullLegalEntityRequest.getUserExternalId())
                                    .withFullName("full name"))
                            .withReferenceJobRoleNames(List.of(REFERENCE_JOB_ROLE))))
                    .withExternalId(pullLegalEntityRequest.getLegalEntityExternalId())
                    .withName(pullLegalEntityRequest.getLegalEntityExternalId())
                    .withRealmName(pullLegalEntityRequest.getRealmName()));
    }
}
