package cm.uy1.custumerservice.service;

import java.util.List;

import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import graphql.schema.DataFetchingEnvironment;

@Component
public class GraphQlExceptionHandler extends DataFetcherExceptionResolverAdapter {
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex,
            DataFetchingEnvironment env) {
        return new GraphQLError() {

            @Override
            public String getMessage() {
                return ex.getMessage();
            }

            @Override
            public ErrorClassification getErrorType() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getErrorType'");
            }

            @Override
            public List<SourceLocation> getLocations() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getLocations'");
            }
        };
    }

}