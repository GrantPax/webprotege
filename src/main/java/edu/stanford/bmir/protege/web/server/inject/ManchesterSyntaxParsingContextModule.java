package edu.stanford.bmir.protege.web.server.inject;

import com.google.inject.AbstractModule;
import edu.stanford.bmir.protege.web.server.owlapi.OWLAPIProject;
import edu.stanford.bmir.protege.web.shared.entity.OWLEntityData;
import edu.stanford.bmir.protege.web.shared.frame.HasFreshEntities;

import java.util.Set;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics Research Group, Date: 25/03/2014
 *
 */
public class ManchesterSyntaxParsingContextModule extends AbstractModule {

    private HasFreshEntities hasFreshEntities;

    public ManchesterSyntaxParsingContextModule(HasFreshEntities hasFreshEntities) {
        this.hasFreshEntities = hasFreshEntities;
    }

    @Override
    protected void configure() {
        bind(HasFreshEntities.class).toInstance(hasFreshEntities);
    }
}
