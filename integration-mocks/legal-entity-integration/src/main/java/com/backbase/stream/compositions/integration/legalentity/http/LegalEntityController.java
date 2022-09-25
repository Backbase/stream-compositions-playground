package com.backbase.stream.compositions.integration.legalentity.http;

import com.backbase.stream.compositions.integration.legalentity.api.LegalEntityIntegrationApi;
import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityRequest;
import com.backbase.stream.compositions.integration.legalentity.model.PullLegalEntityResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegalEntityController implements LegalEntityIntegrationApi {
    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<PullLegalEntityResponse> pullLegalEntity(
            PullLegalEntityRequest pullLegalEntityRequest) {
        return null;
    }
}
